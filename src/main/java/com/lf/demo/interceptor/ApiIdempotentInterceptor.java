package com.lf.demo.interceptor;

import com.lf.demo.annotation.ApiIdempotent;
import com.lf.demo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc 接口冥等性拦截器
 * @see
 * @since 1.0
 */
public class ApiIdempotentInterceptor implements HandlerInterceptor {

    @Autowired
    private TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
        if (!(handle instanceof MethodHandle)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handle;
        Method method = handlerMethod.getMethod();

        ApiIdempotent annotation = method.getAnnotation(ApiIdempotent.class);
        if (null != annotation) {
            //冥等性校验，校验通过则放行，校验失败则抛出异常，并通过统一异常处理返回友好提示
            checkApiIdempotent(request);
        }
        return true;
    }

    private void checkApiIdempotent(HttpServletRequest request) {
        tokenService.checkToken(request);
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

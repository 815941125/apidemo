package com.lf.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/27
 * @desc 在需要保证接口冥等性的controller的方法上使用此注释
 * @see
 * @since 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiIdempotent {

}

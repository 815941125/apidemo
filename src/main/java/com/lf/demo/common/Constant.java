package com.lf.demo.common;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/27
 * @desc
 * @see
 * @since 1.0
 */
public class Constant {

    public interface Redis {
        String OK = "OK";

        // 过期时间, 60s, 一分钟
        int EXPIRE_TIME_MINUTE = 60;

        // 过期时间, 一小时
        int EXPIRE_TIME_HOUR = 60 * 60;

        // 过期时间, 一天
        int EXPIRE_TIME_DAY = 60 * 60 * 24;

        String TOKEN_PREFIX = "token:";
    }
}

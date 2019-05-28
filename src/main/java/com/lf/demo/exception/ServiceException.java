package com.lf.demo.exception;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc 业务逻辑异常
 * @see
 * @since 1.0
 */
public class ServiceException extends RuntimeException {

    private String code;
    private String msg;

    public ServiceException() {
    }

    public ServiceException(String msg) {
        this.msg = msg;
    }

    public ServiceException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package com.linchao.dto;

import java.io.Serializable;

/**
 * @author : linchao
 * @date : 2017/8/4.
 * @description : 后端往前端传输数据的DTO
 */
public class ResultInfo<T> implements Serializable{
    private static final long serialVersionUID = -408972506095088887L;
    private String code;  //code为1返回成功
    private String msg;
    private T body;

    public ResultInfo() {
    }

    public ResultInfo(String code, String msg, T body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
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

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}

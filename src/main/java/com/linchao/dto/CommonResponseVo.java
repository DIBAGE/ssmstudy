package com.linchao.dto;

/**
 * @author : linchao
 * @date : 2017/8/4.
 * @description : 后端往前端传输数据的DTO
 */
public class CommonResponseVo {
    private static final long serialVersionUID = -408972506095088887L;
    private String rstcode;
    private String rstmsg;
    private Object body;

    public CommonResponseVo() {
    }

    public CommonResponseVo(String rstcode, String rstmsg, Object body) {
        this.rstcode = rstcode;
        this.rstmsg = rstmsg;
        this.body = body;
    }

    public String getRstcode() {
        return rstcode;
    }

    public void setRstcode(String rstcode) {
        this.rstcode = rstcode;
    }

    public String getRstmsg() {
        return rstmsg;
    }

    public void setRstmsg(String rstmsg) {
        this.rstmsg = rstmsg;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

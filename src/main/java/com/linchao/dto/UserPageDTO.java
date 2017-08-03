package com.linchao.dto;

/**
 * @author : linchao
 * @date : 2017/8/3.
 * @description :
 */
public class UserPageDTO {
    public int page;
    public Object body;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}

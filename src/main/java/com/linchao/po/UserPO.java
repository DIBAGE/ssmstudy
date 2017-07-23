package com.linchao.po;

import org.apache.ibatis.type.IntegerTypeHandler;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@Component()
public class UserPO implements Serializable {
    private Integer id;
    private Integer userId;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

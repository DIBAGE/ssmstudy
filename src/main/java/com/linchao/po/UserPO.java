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

    private String userName;

    private Integer userId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

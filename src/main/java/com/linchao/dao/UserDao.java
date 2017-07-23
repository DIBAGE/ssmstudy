package com.linchao.dao;

import com.linchao.po.UserPO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
public interface UserDao {
    public UserPO queryById(int id);

}

package com.linchao.service;

import com.linchao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : linchao
 * @date : 2017/7/22.
 * @description :
 */
@Service("userServiceImp")
public class UserServiceImp {

    @Resource
    UserDao userDao;

    public void get(){
        System.out.println(userDao.queryById(1).getUserName());
    }
}

package com.linchao.service;

import com.linchao.dao.UserDao;
import com.linchao.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/22.
 * @description :
 */
@Service("userServiceImp")
public class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao;

    public List<UserPO> getUser(){
        return userDao.getUserByPage(2,3);
    }
}

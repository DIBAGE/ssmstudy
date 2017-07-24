package com.linchao.dao;

import com.linchao.service.UserServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : linchao
 * @date : 2017/7/24.
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Autowired
    UserServiceImp userServiceImp;
    @Autowired
    UserDao userDao;
    @Test
    public void get(){
        userServiceImp.get();
        System.out.println(userDao.selectByPrimaryKey(101));
    }
}

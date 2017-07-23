package com.linchao.dao;

import com.linchao.dao.UserDao;
import com.linchao.service.UserServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:application.xml"})
public class UserDaoTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    UserServiceImp userDao;

    @Test
    public void get(){
        userDao.get();
    }
}

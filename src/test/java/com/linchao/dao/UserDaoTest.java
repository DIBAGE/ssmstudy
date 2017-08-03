package com.linchao.dao;

import com.linchao.po.UserPO;
import com.linchao.service.UserServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * @author : linchao
 * @date : 2017/7/24.
 * @description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Autowired
    UserServiceImp userServiceImp;

    @Test
    public void get() {
        List<UserPO> userList = userServiceImp.getUser();
        Assert.assertEquals("qian", userList.get(0).getUserName());
    }

}

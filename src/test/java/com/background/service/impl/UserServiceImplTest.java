package com.background.service.impl;

import com.background.pojo.UserInfo;
import com.background.service.UserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;



public class UserServiceImplTest {

    UserService userService;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
         userService = context.getBean(UserService.class);


    }

    @Test
    public void loginCheck() {


    }

    @Test
    public void addUserInfo() {
    }

    @Test
    public void getUserInfo() {
        List<UserInfo> userInfo = userService.getUserInfo();
    }

    @Test
    public void updateUser() {

    }
}
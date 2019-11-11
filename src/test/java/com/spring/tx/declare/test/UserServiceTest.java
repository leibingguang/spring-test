package com.spring.tx.declare.test;

import com.spring.tx.bean.User;
import com.spring.tx.declare.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class UserServiceTest {
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx/datasource.xml");

    @Test
    public void testUserSave() {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        UserService userService = (UserService) context.getBean("userService");

        User user = new User();
        user.setId(1);
        user.setUsername("leibingguang");
        user.setAge(27);
        user.setSex(1);
        user.setCreateTime(new Date());
        userService.save(user);
        userService.save(user, "11111111111");
    }

}
package com.spring.tx.programing.test;

import com.spring.tx.bean.User;
import com.spring.tx.programing.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ProgramingTransactionTest {
    static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx/datasource.xml");

    @Test
    public void test()
    {
       UserServiceImpl userService =  (UserServiceImpl)context.getBean(UserServiceImpl.class);
        User user = new User();
        user.setId(1);
        user.setUsername("leibingguang");
        user.setAge(27);
        user.setSex(1);
        user.setCreateTime(new Date());
       userService.saveUser(user);
    }
}

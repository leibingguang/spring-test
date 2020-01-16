package com.spring.tx.declare.test;

import com.spring.tx.bean.User;
import com.spring.tx.declare.service.UserService;
import com.spring.tx.declare.service.impl.UserServiceImpl;
import org.aspectj.apache.bcel.classfile.annotation.AnnotationElementValue;
import org.junit.Test;
import org.springframework.beans.annotation.AnnotationBeanUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.AnnotatedElement;
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
//        userService.save(user, "11111111111");
    }

    @Test
    public void testFindMergedAnnotationAttributes() throws NoSuchMethodException
    {
        UserService userService = (UserService) context.getBean("userService");
        AnnotatedElement method = userService.getClass().getMethod("save", User.class);
        AnnotationAttributes annotationAttributes = AnnotatedElementUtils.findMergedAnnotationAttributes(method, Transactional.class, false, false);
        System.out.println(annotationAttributes);
    }

}

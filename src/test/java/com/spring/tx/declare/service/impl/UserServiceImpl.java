package com.spring.tx.declare.service.impl;

import com.spring.tx.bean.User;
import com.spring.tx.declare.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ExecutorService;

@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserServiceImpl implements UserService{

    private UserService userService;

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class}, timeout = -1, isolation = Isolation.READ_COMMITTED)
    public void save(User user) {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), user.getUsername(), user.getAge(), user.getSex(), new Date());
//        userService.save(user, "2222222");
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public void save(User user, String name) {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), name, user.getAge(), user.getSex(), new Date());
    }

    @Bean
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

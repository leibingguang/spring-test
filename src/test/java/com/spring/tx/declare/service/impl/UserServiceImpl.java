package com.spring.tx.declare.service.impl;

import com.spring.tx.bean.User;
import com.spring.tx.declare.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class UserServiceImpl implements UserService{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(User user) {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), user.getUsername(), user.getAge(), user.getSex(), new Date());
//        this.save(user, "2222222");
    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public void save(User user, String name) {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), name, user.getAge(), user.getSex(), new Date());
    }
}

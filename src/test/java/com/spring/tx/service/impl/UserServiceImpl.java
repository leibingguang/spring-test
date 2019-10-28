package com.spring.tx.service.impl;

import com.spring.tx.bean.User;
import com.spring.tx.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class UserServiceImpl implements UserService{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public void save(User user) {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), user.getUsername(), user.getAge(), user.getSex(), new Date());
        throw new RuntimeException();
    }
}

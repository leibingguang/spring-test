package com.spring.tx.programing.service;

import com.spring.tx.bean.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;

public class UserDaoImpl {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user)
    {
        jdbcTemplate.update("insert into t_user(id, username, age, sex, create_time) values (?, ?, ?, ?, ?)",
                user.getId(), user.getUsername(), user.getAge(), user.getSex(), new Date());
    }
}

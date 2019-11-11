package com.spring.tx.declare.service;

import com.spring.tx.bean.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional()
public interface UserService {
    void save(User user);
    void save(User user, String name);
}

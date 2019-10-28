package com.spring.tx.service;

import com.spring.tx.bean.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional()
public interface UserService {
    void save(User user);
}

package com.spring.tx.declare.service;

import com.spring.tx.bean.User;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@Transactional(rollbackFor = {InterruptedException.class, UnexpectedRollbackException.class})
public interface UserService {

//    @Transactional(propagation = Propagation.NEVER)
    void save(User user);
    @Transactional(propagation = Propagation.NESTED)
    void save(User user, String name);
}

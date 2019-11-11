package com.spring.tx.programing.service;

import com.spring.tx.bean.User;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class UserServiceImpl {
    private UserDaoImpl userDaoImpl;
    private TransactionTemplate transactionTemplate;

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void saveUser(User user)
    {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {
                    userDaoImpl.save(user);
                }catch (Exception e)
                {
                    status.setRollbackOnly();
                    System.out.println("Transfer Error!");
                }
                return null;
            }
        });
    }
}

package com.spring.tx.propagation.service.impl;

import com.spring.tx.propagation.bean.Department;
import com.spring.tx.propagation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void insertDepartmentNested(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void insertDepartmentNestedThrowEx(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
        throw new RuntimeException();
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void insertDepartmentMandatory(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertDepartmentRequired(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insertDepartmentRequiredNew(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void insertDepartmentSupports(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void insertDepartmentNotSupported(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public void insertDepartmentNever(Department department) {
        jdbcTemplate.update("insert into test_department(name) values (?)", department.getName());
    }

    @Override
    public void truncateDepartment() {
        jdbcTemplate.update("delete from test_department");
    }
}

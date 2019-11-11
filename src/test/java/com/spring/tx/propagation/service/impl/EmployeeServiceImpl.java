package com.spring.tx.propagation.service.impl;

import com.spring.tx.propagation.bean.Employee;
import com.spring.tx.propagation.service.DepartmentService;
import com.spring.tx.propagation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DepartmentService departmentService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertEmployeeRequireNestedThrowEx(Employee employee) {
        jdbcTemplate.update("insert into test_employee(id, name, address) values (?, ?, ?)",
                employee.getId(), employee.getName(), employee.getAddress());
        try {
            departmentService.insertDepartmentNestedThrowEx(employee.getDepartment());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertEmployeeRequireNested(Employee employee) {
        jdbcTemplate.update("insert into test_employee(id, name, address) values (?, ?, ?)",
                employee.getId(), employee.getName(), employee.getAddress());
        departmentService.insertDepartmentNested(employee.getDepartment());
    }

    @Override
    public void truncateEmployee() {
        jdbcTemplate.update("delete from test_employee");
    }
}

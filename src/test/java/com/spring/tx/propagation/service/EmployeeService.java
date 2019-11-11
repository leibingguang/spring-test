package com.spring.tx.propagation.service;

import com.spring.tx.propagation.bean.Employee;

public interface EmployeeService {
    void insertEmployeeRequireNestedThrowEx(Employee employee);
    void insertEmployeeRequireNested(Employee employee);
    void truncateEmployee();
}

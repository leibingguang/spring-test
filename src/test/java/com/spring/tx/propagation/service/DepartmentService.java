package com.spring.tx.propagation.service;

import com.spring.tx.propagation.bean.Department;

public interface DepartmentService {
    void insertDepartmentNested(Department department);
    void insertDepartmentNestedThrowEx(Department department);
    void insertDepartmentMandatory(Department department);
    void insertDepartmentRequired(Department department);
    void insertDepartmentRequiredNew(Department department);
    void insertDepartmentSupports(Department department);
    void insertDepartmentNotSupported(Department department);
    void insertDepartmentNever(Department department);

    void truncateDepartment();
}

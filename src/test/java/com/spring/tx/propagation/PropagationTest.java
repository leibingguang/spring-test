package com.spring.tx.propagation;

import com.spring.tx.propagation.bean.Department;
import com.spring.tx.propagation.bean.Employee;
import com.spring.tx.propagation.service.DepartmentService;
import com.spring.tx.propagation.service.EmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropagationTest {
    private ClassPathXmlApplicationContext context = null;
    private DepartmentService departmentService = null;
    private EmployeeService employeeService = null;

    private Employee employee = null;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("tx/propagation-datasource.xml");
        departmentService = context.getBean(DepartmentService.class);
        employeeService = context.getBean(EmployeeService.class);
        Department department = new Department("技术部");
        employee = new Employee(1L, "leibingguang", "杭州", department);

    }

    /**
     * 事务传播性：
     * 外层为required、内层为nested
     * 内层的异常不会导致外层的回退
     * 外层的异常会导致内层的回退
     */
    @Test
    public void testRequiredNestedThrowEx() {
        employeeService.insertEmployeeRequireNestedThrowEx(employee);
    }

    /**
     * 事务传播性：
     * 无异常
     */
    @Test
    public void testRequiredNested() {
        employeeService.insertEmployeeRequireNested(employee);
    }

    @After
    public void after() {
        employeeService.truncateEmployee();
        departmentService.truncateDepartment();
    }
}

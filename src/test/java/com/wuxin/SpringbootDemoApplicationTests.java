package com.wuxin;

import com.wuxin.dao.DepartmentDao;
import com.wuxin.dao.EmployeeDao;
import com.wuxin.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @Test
    void contextLoads() {

        Collection<Employee> employees = employeeDao.getAll();
        System.out.println(employees);
        System.out.println("hello git!");

    }

}

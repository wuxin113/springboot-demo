package com.wuxin;

import com.wuxin.dao.DepartmentDao;
import com.wuxin.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @Test
    void contextLoads() {

        System.out.println("hello git!");
        System.out.println("hello git!!");
        System.out.println("hello git!!!");
        System.out.println("hello git! master");
        System.out.println("hello git! hot-fix");

    }

}

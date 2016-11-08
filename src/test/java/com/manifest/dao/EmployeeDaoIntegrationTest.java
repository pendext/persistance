package com.manifest.dao;

import com.manifest.domain.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoIntegrationTest extends AbstractIntegrationTest {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void employeesCanBeSavedAndRetrieved() {
        Employee employee = new Employee();
        employeeDao.save(employee);
    }

}
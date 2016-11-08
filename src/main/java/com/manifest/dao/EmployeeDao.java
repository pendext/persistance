package com.manifest.dao;

import com.manifest.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Long> {
}

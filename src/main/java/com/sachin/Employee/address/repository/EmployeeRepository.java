package com.sachin.Employee.address.repository;

import com.sachin.Employee.address.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

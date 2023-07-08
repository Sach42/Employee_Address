package com.sachin.Employee.address.service;

import com.sachin.Employee.address.model.Employee;
import com.sachin.Employee.address.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            employee.setEmpFirstName(updatedEmployee.getEmpLastName());
            employee.setEmpFirstName(updatedEmployee.getEmpLastName());
            if (updatedEmployee.getAddress() != null) {
                employee.getAddress().setStreet(updatedEmployee.getAddress().getStreet());
                employee.getAddress().setCity(updatedEmployee.getAddress().getCity());
                employee.getAddress().setState(updatedEmployee.getAddress().getState());
                employee.getAddress().setZipcode(updatedEmployee.getAddress().getZipcode());
            }
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}



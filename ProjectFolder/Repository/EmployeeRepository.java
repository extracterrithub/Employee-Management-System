package com.example.employeemanagement_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagement_system.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

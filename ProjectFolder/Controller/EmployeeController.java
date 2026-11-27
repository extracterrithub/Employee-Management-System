package com.example.employeemanagement_system.controller; 
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement_system.entity.Employee;
import com.example.employeemanagement_system.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/details")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	//Constructor injection
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public String insertDetails(@Valid @RequestBody Employee employee) {
		return employeeService.insertDetails(employee);
	}
	
	@GetMapping
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	
	@GetMapping("/{id}")
	public Object getById(@PathVariable Integer id) {
		return employeeService.getById(id);
	}
	
	@DeleteMapping
	public void deleteAll() {
		employeeService.delete();
	}
	
	@DeleteMapping("/{id}")
	public Object deleteById(@PathVariable Integer id) {
		return employeeService.deleteById(id);
	}
	
	@PutMapping
	public Object update(@RequestBody Employee employee){
		return employeeService.update(employee);
		
	}
	

}

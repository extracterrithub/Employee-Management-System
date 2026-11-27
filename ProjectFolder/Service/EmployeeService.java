package com.example.employeemanagement_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employeemanagement_system.entity.Employee;
import com.example.employeemanagement_system.repository.EmployeeRepository;
 
@Service
public class EmployeeService {

	
	private EmployeeRepository employeeRepository;
	//Constructor injection
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
	//Insert
	public String insertDetails(Employee employee) {
		employeeRepository.save(employee);
		return "Data inserted successfully";
	}
	
	//Get
		public List<Employee> getAll(){
			return employeeRepository.findAll();
		}
		
		//getById
		public Object getById(Integer id) {
			  Optional<Employee> op = employeeRepository.findById(id);
			  
			  if(op.isPresent()) {
				  return op.get();
			  }
			  else {
				  return "No data found"+id;
			  }
		}
		
		//delete
		public void delete() {
			employeeRepository.deleteAll();
			
		}
		
		//deleteById
		 public Object deleteById(Integer id){
			 Optional<Employee> op = employeeRepository.findById(id);
			 
			 if(op.isPresent()) {
				 employeeRepository.deleteById(id);;
				 return "Data is deleted sunccesfully";
			 }
			 else {
				 return "No data found with thisn id "+id;
			 }
			 
		 }
		 
		 //update
		 public Object update(Employee employee) {
			 Optional<Employee> op = employeeRepository.findById(employee.getId());
			 
			 if(op.isPresent()) {
				 employeeRepository.save(employee);
				 return "Data is updated succesfully";
			 }
			 else {
				 return "No data is found";
			 }
		 }
		
		

	
	
}

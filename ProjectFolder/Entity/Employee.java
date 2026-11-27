package com.example.employeemanagement_system.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Employee {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;

 @NotBlank(message = "Name is required")
 private String name;

 @Email(message = "Enter a valid email")
 @NotBlank(message = "Email is required")
 @Column(unique = true)
 private String email;

 @NotBlank(message = "City is required")
 private String city;

 @NotNull(message = "Phone number is required")
 private BigInteger phno;

 public Integer getId() {
	return id;
 }

 public void setId(Integer id) {
	this.id = id;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
 }

 public String getEmail() {
	return email;
 }

 public void setEmail(String email) {
	this.email = email;
 }

 public String getCity() {
	return city;
 }

 public void setCity(String city) {
	this.city = city;
 }

 public BigInteger getPhno() {
	return phno;
 }

 public void setPhno(BigInteger phno) {
	this.phno = phno;
 }
 
 
	
}

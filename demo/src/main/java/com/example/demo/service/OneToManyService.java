package com.example.demo.service;

import com.example.demo.model.Department;

public interface OneToManyService {
	public void addDepartment(Department dept);
	public Department getDepartment(Long id);
	
}
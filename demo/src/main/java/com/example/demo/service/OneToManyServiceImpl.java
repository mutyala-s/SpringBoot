package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
@Service
public class OneToManyServiceImpl implements OneToManyService{
	@Autowired
	DepartmentRepository departmentRepo;	
	
	public void addDepartment(Department dept) {
		departmentRepo.save(dept);
		
	}

	@Override
	public Department getDepartment(Long id) {
		Optional<Department> dept = departmentRepo.findById(id);
		Department dept2 = dept.get();
		return dept2;
		
	}

}

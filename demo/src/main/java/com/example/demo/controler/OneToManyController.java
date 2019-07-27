package com.example.demo.controler;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.OneToManyService;

@RestController
public class OneToManyController {
	@Autowired
	OneToManyService oneToManyService;
	
	
	@RequestMapping(value = "/add/onetomany", method = RequestMethod.GET, consumes = { "text/plain",
	"application/*" }, produces = "application/json; charset=utf-8")
    public ResponseEntity<Set<Employee>> addDepartment() {
		Set<Employee> employees = new HashSet<Employee>();
		Department dep = new Department();
		Employee emp1 = new Employee();
		emp1.setCellphone("9880617654");
		emp1.setDepartment(dep);
		emp1.setFirstname("Venkat");
		emp1.setLastname("Mutyala");
		
		Employee emp2 = new Employee();
		emp2.setCellphone("9880617654");
		emp2.setDepartment(dep);
		emp2.setFirstname("Venkat");
		emp2.setLastname("Mutyala");
		
		employees.add(emp1);
		employees.add(emp2);
		
		dep.setDepartmentName("IT");
		dep.setEmployees(employees);
		oneToManyService.addDepartment(dep);
		/*
		 * //Team team = soccerService.savePlayers(); return new */
		return new  ResponseEntity<Set<Employee>>(employees, HttpStatus.OK);	 
        
    }
	@RequestMapping(value = "/get/onetomany", method = RequestMethod.GET, consumes = { "text/plain",
	"application/*" }, produces = "application/json; charset=utf-8")
    public ResponseEntity<Department> getDepartment(@RequestParam("id") String deptId) {		
		Department dept  = oneToManyService.getDepartment(Long.valueOf(deptId));
		/*
		 * //Team team = soccerService.savePlayers(); return new */
		if(dept==null)
			return new  ResponseEntity<Department>(dept, HttpStatus.NOT_FOUND);
		else
		return new  ResponseEntity<Department>(dept, HttpStatus.OK);	 
        
    }
}

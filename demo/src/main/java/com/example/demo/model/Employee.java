package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name="EMPLOYEE")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "employeeId")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_Sequence")
	@SequenceGenerator(name = "emp_Sequence", sequenceName = "EMP_SEQ")
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="cell_phone")
	private String cellphone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(String firstname, String lastname, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = new Date(System.currentTimeMillis());
		this.cellphone = phone;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// Getter and Setter methods
}
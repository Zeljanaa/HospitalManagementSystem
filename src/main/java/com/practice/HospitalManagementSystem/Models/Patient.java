package com.practice.HospitalManagementSystem.Models;

import java.sql.Date;

public class Patient extends User {

	Department department;

	public Patient() {
		super();
	}

	public Patient(int id, String firstName, String lastName, Date dateOfBirth, String phone, String email,
			String password, Department department) {
		super(id, firstName, lastName, dateOfBirth, phone, email, password);
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
	
}

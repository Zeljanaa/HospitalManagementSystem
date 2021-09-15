package com.practice.HospitalManagementSystem.Models;

import java.sql.Date;

public class Doctor extends User {

	String specialization;
	String fromTime;
	String toTime;

	public Doctor(int id, String firstName, String lastName, Date dateOfBirth, String phone, String email,
			String password, String specialization, String fromTime, String toTime) {
		super(id, firstName, lastName, dateOfBirth, phone, email, password);
		this.specialization = specialization;
		this.fromTime = fromTime;
		this.toTime = toTime;
	}

	public Doctor() {
		super();
	}

	
}

package com.boa.entity;

import jakarta.persistence.Entity;

@Entity
public class Professor {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
  
}

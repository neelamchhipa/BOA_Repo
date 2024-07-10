package com.boa.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
  @Override
	public String toString() {
		return "Admin [role=" + role + ", getRole()=" + getRole() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

private String role;

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}
}

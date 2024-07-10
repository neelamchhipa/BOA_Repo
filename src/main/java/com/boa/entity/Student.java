package com.boa.entity;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {
  private Long courseId;

public Long getCourseId() {
	return courseId;
}

public void setCourseId(Long courseId) {
	this.courseId = courseId;
}
}

package com.boa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.entity.Admin;

@Repository
public interface CourseRepository extends JpaRepository<Admin, Long> {

}

package com.boa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.entity.Professor;

@Repository
public interface PrfessorRepository extends JpaRepository<Professor, Long> {

}

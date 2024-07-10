package com.boa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.entity.Professor;
import com.boa.entity.Student;
import com.boa.repo.PrfessorRepository;
import com.boa.repo.StudentRepository;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    private final PrfessorRepository prfessorRepository;

    @Autowired
    public ProfessorController(PrfessorRepository prfessorRepository) {
        this.prfessorRepository = prfessorRepository;
    }

    @GetMapping  
    public List<Professor> getAllProfessor() {
        return prfessorRepository.findAll();
    }

    @PostMapping
    public Professor addProfessor(@RequestBody Professor professor) {
        return prfessorRepository.save(professor);
    }

}

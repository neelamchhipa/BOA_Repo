package com.boa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.entity.Admin;
import com.boa.entity.Professor;
import com.boa.entity.Student;
import com.boa.repo.AdminRepository;
import com.boa.repo.PrfessorRepository;
import com.boa.repo.StudentRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	
	private static final Logger log = LoggerFactory.getLogger(AdminController.class);
    private final AdminRepository adminRepository;
    private final PrfessorRepository prfessorRepository;

    @Autowired
    public AdminController(AdminRepository adminRepository, PrfessorRepository prfessorRepository) {
        this.adminRepository = adminRepository;
		this.prfessorRepository = prfessorRepository;
    }

    @GetMapping  
    public List<Admin> getAllAdmin() {
   	log.info("Get the admin details");
 	log.debug("Get all admins" +adminRepository.findAll().toString());
      return adminRepository.findAll();
    }

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }
    
    @PostMapping("/addProfessor")
    public Professor addProfessor(@RequestBody Professor professor) {
        return prfessorRepository.save(professor);
    }

}

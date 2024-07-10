package com.boa.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boa.entity.Student;





@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	/**
	 * @return
	 * Query use to fetch unapproved user.
	 */
	@Query(value="Select * from user where isApproved=0",nativeQuery=true)
	List<Student> findUnapproved();
	
	/**
	 * @param id
	 * @return
	 * Query use to approve user.
	 */
	@Modifying
	@Query(value="update user set isApproved=true where userId= ?1", nativeQuery = true)
	public void approveById(int id);	
	
	/**
	 * @param userName
	 * @param password
	 * @return
	 * Query use to perform login authentication.
	 */
	@Query(value="select * from user where userName = ?1 and userPassword = ?2", nativeQuery = true)
	public List<Student> loginValidation(String userName, String password);
	
}
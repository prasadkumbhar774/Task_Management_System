package com.odyssey.todomanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.odyssey.todomanagement.model.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff, Integer>{
	
	
	// We can write any number of possible queries as long as possible.
	
	
	// The following methods are used to 
	
	
	@Query("select u from Staff u where u.useremail = ?1")
	Staff findOneStaff(String email);	

}

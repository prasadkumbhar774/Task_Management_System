package com.odyssey.todomanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odyssey.todomanagement.model.Image;

@Repository
public interface ImageDao 
     extends JpaRepository<Image, Integer> {
	
	

}

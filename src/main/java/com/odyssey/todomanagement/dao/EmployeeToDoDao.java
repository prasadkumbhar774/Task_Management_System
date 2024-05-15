package com.odyssey.todomanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.odyssey.todomanagement.model.EmployeeToDo;

public interface EmployeeToDoDao 
		extends JpaRepository<EmployeeToDo, Integer>

		{
			
		}

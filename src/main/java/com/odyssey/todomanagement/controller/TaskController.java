package com.odyssey.todomanagement.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.odyssey.todomanagement.dao.TaskDao;
import com.odyssey.todomanagement.model.Task;

@Controller
public class TaskController {

	// We need to autowire the dao that does the database manipulation. 
	/**
	 * The first step in designing the controller is either define the 
	 * Data access object that retrieves the data from the database.
	 * The password and user name of the database should be defined in the application properties
	 * file 
	 * The data source, user name, and password of the database should be defined 
	 * in the properties file
	 * 
	 *  the best practice is design the service layer and define all the business logic 
	 *  inside this file
	 *  
	 *  Controller should access the data from the service layer and provides
	 *  the view layer is provided by the controller
	 *  
	 * 
	 */

	/**
	@Autowired
	TaskDao taskDao;

	@GetMapping("/task")
	public String getTask() {
		return "task";
	}

	@PostMapping("/addTask")
	public String addTask(Model model, Task task) {
      
		taskDao.save(task);
		return "addTask";
	}
	
	@GetMapping("alltasks")
	public String getAllTasks(Model model) {
		
		Period intervalPeriod;
		
		List<Task> tasks = taskDao.findAll();
		
		
		Map<Period, Task> duration = new HashMap<>();
		
		for(Task t : tasks) {
			intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
			duration.put(intervalPeriod, t);
			
		}
		
		model.addAttribute("tasks",duration);
		return "alltasks";
	}
*/
}

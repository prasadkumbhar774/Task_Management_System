package com.odyssey.todomanagement.controller;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.odyssey.todomanagement.dao.StaffDao;
import com.odyssey.todomanagement.dao.TaskDao;
import com.odyssey.todomanagement.model.Staff;
import com.odyssey.todomanagement.model.Task;
import com.odyssey.todomanagement.service.EmailService;

@Controller
public class ToDoController {

	
	/**
	 * The first step in designing any controller is define the data access object
	 * the define the end point / URI. 
	 * 
	 *  In case of designing the RESTful web services, designing the REST controller and 
	 *  define the rest end points. 
	 *  
	 *  
	 */
	
	@Autowired
	TaskDao taskDao;
	
	@Autowired
	StaffDao staffDao;
	
	// The following is using an email service
	@Autowired
	EmailService emailService;
	
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		
		// Finding the working directory of java
		
		// System.out.println(Paths.get("").toAbsolutePath().toString());
		
		Period intervalPeriod;
		
		List<Task> tasks = taskDao.findAll();
		
		
		Map<Period, Task> duration = new HashMap<>();
		
		for(Task t : tasks) {
			intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
		duration.put(intervalPeriod, t);
			
		}
		
		model.addAttribute("tasks",duration);
		return "main";
	}

	
	@GetMapping("/task")
	public String getTask() {
		return "task";
	}

	
	
	@PostMapping("/addTask")
	public String addTask(Model model, Task task) {
	
	 	Staff staff = staffDao.findOneStaff(task.getEmail());
        task.setStaff(staff);
        
		taskDao.save(task);
		
		//emailService.sendSimpleMessage("mahetot@gmail.com", "Test", "Sending email");
		
		Period intervalPeriod;
		
		List<Task> tasks = taskDao.findAll();
		Map<Period, Task> duration = new HashMap<>();
		
		for(Task t : tasks) {
			intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
			duration.put(intervalPeriod, t);
			
		}
		
		model.addAttribute("tasks",duration);
		
		return "main";
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

	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String getDelete(@PathVariable("id") int id, Model model) {
		taskDao.deleteById(id);

		List<Task> todos = new ArrayList<>();
		todos = taskDao.findAll();

		model.addAttribute("todos", todos);

		return "main";
	}
	
	

	@RequestMapping("/update/{id}")
	public String getUpdate(@PathVariable("id") int id, Model model) {
		Task todo = taskDao.getOne(id);
		model.addAttribute("todo", todo);
		return "update";
	}
	
	@RequestMapping("/searchstaff")
	public String getStaffWithToDo() {
		return "searchstaff";
	}

	// The following method is used to Update the Todos Application. Using the id o
	// of the id of the ToDo application.

	// The following is used to write custom queries.

	@PostMapping("/updateToDo/{id}")
	public String getUpdatedToDo(@PathVariable("id") int id, Task todo, Model model) {

		Task todos = taskDao.getOne(id);
		todos.setEmail(todo.getEmail());
		todos.setTask_descrption(todo.getTask_descrption());
		todos.setDue_date(todo.getDue_date());
		todos.setCreated_date(todo.getCreated_date());
		taskDao.save(todos);

		Period intervalPeriod;
		
		List<Task> tasks = taskDao.findAll();
		
		
		Map<Period, Task> duration = new HashMap<>();
		
		for(Task t : tasks) {
			intervalPeriod = Period.between(t.getDue_date(), LocalDate.now());
			duration.put(intervalPeriod, t);
			
		}
		
		model.addAttribute("tasks",duration);		

		return "main";
	}
	

	// JPQL Example - Where the query is written in the repository
//
//	@GetMapping("getTodo/{id}")
//	public String getTodonativeQuery(@PathVariable("id") int id, Model model) {
//
//		ToDo todo = todoDao.findTodobyId(id);
//		model.addAttribute("todos", todo);
//		return "Todosnative";
//	}

	/**
	 * The normal systems that are common to the things that are common to this and
	 * the natural ways of ordering things in this matter.
	 * 
	 * 
	 */

}

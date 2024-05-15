package com.odyssey.todomanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HttpController {

	/** 
	 * 
	 * @param request is http servlet request that handles the request object
	 * There are many objects in Servlet that provides the servlet context
	 * HttpServletRequest
	 * HttpServletResponce
	 * HttpSession
	 * @return It returns the view of main that have main contents. 
	 * 
	 */
	
	@RequestMapping("/gethttp")
	public String getSettionsTime(HttpServletRequest request) {

		System.out.println(request.getSession().getCreationTime());
		System.out.println(request.getSession());
		System.out.println(request.getRemoteAddr());

		return "main";
	}
	
	@RequestMapping("/getUsers/{id}")
	public void getUsers() {
		
		System.out.println("");
		System.out.println("There are many things that are common");
	}
	
	/**
	 * The following method returns that id of the courese with 
	 * the specified id number. 
	 */
	
	@RequestMapping("/getUsers/{id}/getCourse/{id}")
	public void getBooks() {
		
		/**
		 * This is the method which returns the user and the course related 
		 * to that user
		 */
		
	}
	
	/**
	 * The following things are done in the following things
	 */
	@RequestMapping("/home/{id}")
	public String getHomePage(@RequestParam("id") String id, Model model) {
		
		return "";
	}
}

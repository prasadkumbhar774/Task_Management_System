package com.odyssey.todomanagement.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.odyssey.todomanagement.dao.StaffDao;
import com.odyssey.todomanagement.model.Staff;

@Controller
public class StaffController {
	
	private static String UPLOADED_FOLDER = 
	
			"/Users/amisale/Desktop/Java Projects/todo-management/src/main/resources/META-INF/resources/WEB-INF/images/";


	@Autowired
	StaffDao staffDao;
	
	@RequestMapping("/staff")
	public String getStaffRegistrationForm() {
	
		return "staff";
	}
	
	@RequestMapping("/registration") 
    public String singleFileUpload(@RequestParam("file") MultipartFile file, 
    		Staff staff )
	throws Exception{
		
		    //  The first step is save all the staff information into the database
           //  String filePath = UPLOADED_FOLDER + file.getOriginalFilename();
		
             staff.setPicture(file.getOriginalFilename());
             staffDao.save(staff);
             
             
          // uplaod the file into the local machine. 
             
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            
            
            return "registration";
    }
	 	   
	  @GetMapping("/allstaff")
	  public String getAllStaff(Model model) {
		  
		  List<Staff> staffs  = new ArrayList<>();
		  staffs  = staffDao.findAll();
		  
		  for(Staff s : staffs) {
			  System.out.println(s);
		  }
		  model.addAttribute("staffs",staffs);
		  return "allstaff";
	   }
	  
		/**
		 * 
		 * @param model used to transfer the data to the view layer
		 * @param id is the staff id
		 * @return the staff details view to the user
		 */
		
		@GetMapping("/staff/{id}")
		public String getStaffDeials(Model model, @PathVariable("id") int id) {
			Staff staff = staffDao.getOne(id);
			model.addAttribute("staff", staff);
			return "staffdetails";
		}

}

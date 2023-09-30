package com.OAS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OAS.Repository.UserRegistrationRepository;
import com.OAS.model.UserRegistration;
@RestController  

public class UserRegistrationController {
	
	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	
	@PostMapping  (value = "/product")  
	@CrossOrigin(origins = "http://localhost:4200")
	public UserRegistration saveUserRegistration(@RequestBody  UserRegistration details) {
		return userRegistrationRepository.save(details);
		
	}
    @GetMapping  (value = "/product")  
	public String saveUserRegistration1() {
		return "hhh";  
		
	}
    
    @GetMapping  (value = "/userlogin")
	@CrossOrigin(origins = "http://localhost:4200")
    public List<UserRegistration> userlogin(@RequestParam String username ,@RequestParam String password) {
    	List<UserRegistration> userid;
    	userid=userRegistrationRepository.findByusername(username, password);
    	System.err.println(username);
		System.err.println(password);
		System.err.println(userid.size());
		if(userid.size()>0) {
		   userid.get(0).setVisit(System.currentTimeMillis());
		   System.err.println(userid.get(0).getVisit());
		   userid=userRegistrationRepository.saveAll(userid);
		}
		return userid;
		
    	
     }
     
    
    @GetMapping  (value = "/username")
    public String userlogin(@RequestParam String username ) {
		return username;
     }
     
}

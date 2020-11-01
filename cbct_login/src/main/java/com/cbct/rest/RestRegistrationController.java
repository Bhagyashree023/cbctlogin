package com.cbct.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbct.model.UserDetails;
import com.cbct.rest.model.RegistrationStatus;
import com.cbct.service.UserDetailsService;

@RestController
public class RestRegistrationController {
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("rest/registration")
	public RegistrationStatus login(@RequestBody UserDetails userDetails) {
		RegistrationStatus registrationStatus = new RegistrationStatus();
		Boolean status=userDetailsService.createUser(userDetails);
		if(status==true) {
			registrationStatus.setStatus_code(200);
			registrationStatus.setMessage("Registation Successful");
		}
		else {
			registrationStatus.setStatus_code(400);
			registrationStatus.setMessage("Registration Failed");
		}
		
		
		
		return registrationStatus;
	} 

}

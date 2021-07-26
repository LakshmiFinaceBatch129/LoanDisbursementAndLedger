package com.webcorestone.loandisbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.exceptionhandler.UserNotFoundException;
import com.webcorestone.loandisbursement.mastermodel.User;
import com.webcorestone.loandisbursement.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserService us;
	
	
	@GetMapping("/{uname}")
	public ResponseEntity<User> getUser(@PathVariable("uname") String username)throws UserNotFoundException 
	{
	User user=	us.getUser(username);
	
	if(user==null)
	{
		throw new UserNotFoundException("User Not Found");
	}
	return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}

}

package com.webcorestone.loandisbursement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.mastermodel.AccountHead;
import com.webcorestone.loandisbursement.service.AccountHeadService;
@CrossOrigin("*")
@RestController
@RequestMapping("/accounthead")
public class AccountHeadController 
{
	@Autowired
	AccountHeadService ae;
	
	@PostMapping("/")
	public ResponseEntity<?> saveAccountHead(@RequestBody AccountHead ac)
	{
	AccountHead ah=	ae.saveAccountHead(ac);
	if(ah==null)
	{
		return new ResponseEntity<>("Problem During Register Account Head",HttpStatus.BAD_REQUEST);
	}
	else
	{
		return new ResponseEntity<>(ah,HttpStatus.OK);
	}
		
	}
	@GetMapping("/")
	public ResponseEntity<?> getAccountHead()
	{
		List<AccountHead> list=ae.getAccountHead();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}

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

import com.webcorestone.loandisbursement.exceptionhandler.LoanFileNotFound;
import com.webcorestone.loandisbursement.model.LoanFile;
import com.webcorestone.loandisbursement.service.LoanFileService;



@RestController
@CrossOrigin("*")
@RequestMapping("/loanfile")
public class LoanFileController 
{
	@Autowired
     LoanFileService ls;
	@PostMapping("/")
	public ResponseEntity<?> saveLoanFile(@RequestBody LoanFile loanFile)
	{
	LoanFile lo=	ls.saveLoanFile(loanFile);
		return new ResponseEntity<>(lo,HttpStatus.OK);
	}
	@GetMapping("/")
	public ResponseEntity<?> getLoanFile() throws LoanFileNotFound 
	{
		List<LoanFile> list=ls.getLoanFile();
		if(list.isEmpty())
		{
			LoanFileNotFound l=  new LoanFileNotFound("Loan File Not Found");
			 throw l;
	    }
		else
		{
			return new ResponseEntity<>(list,HttpStatus.OK);
		}
	}
	

}

package com.webcorestone.loandisbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.service.CreditManagerService;
import com.webcorestone.loandisbursement.service.LoanFileService;

@RestController
public class CreditManagerController
{
	@Autowired
	CreditManagerService cs;
	
	

}

package com.webcorestone.loandisbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.repository.OperationExecutiveRepository;

@RestController
public class OperationExecutiveController
{
	@Autowired
	OperationExecutiveRepository or;
	

}

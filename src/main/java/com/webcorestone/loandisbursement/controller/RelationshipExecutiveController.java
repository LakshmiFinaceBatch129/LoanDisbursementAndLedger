package com.webcorestone.loandisbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webcorestone.loandisbursement.service.RelationshipExecutiveService;

@RestController
public class RelationshipExecutiveController 
{
	@Autowired
	RelationshipExecutiveService re;

}

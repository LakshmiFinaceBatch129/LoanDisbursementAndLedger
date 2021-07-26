package com.webcorestone.loandisbursement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.repository.RelationshipExecutiveRepository;
import com.webcorestone.loandisbursement.service.RelationshipExecutiveService;
@Service
public class RelationshipExecutiveServiceImpl implements RelationshipExecutiveService 
{
	@Autowired
	RelationshipExecutiveRepository re;

}

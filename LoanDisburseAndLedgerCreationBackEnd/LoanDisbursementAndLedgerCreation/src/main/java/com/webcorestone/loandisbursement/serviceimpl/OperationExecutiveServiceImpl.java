package com.webcorestone.loandisbursement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.repository.OperationExecutiveRepository;
import com.webcorestone.loandisbursement.service.OperationExecutiveService;

@Service
public class OperationExecutiveServiceImpl implements OperationExecutiveService 
{
	@Autowired
	OperationExecutiveRepository or;

}

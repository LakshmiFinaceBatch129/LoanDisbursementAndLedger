package com.webcorestone.loandisbursement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.repository.CreditMangerRepsitory;
import com.webcorestone.loandisbursement.service.CreditManagerService;

@Service
public class CreditManagerServiceImpl implements CreditManagerService
{
	@Autowired
	CreditMangerRepsitory cr;

}

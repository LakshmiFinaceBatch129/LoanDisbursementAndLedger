package com.webcorestone.loandisbursement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.mastermodel.AccountHead;
import com.webcorestone.loandisbursement.repository.AccountHeadRepository;
import com.webcorestone.loandisbursement.service.AccountHeadService;
@Service
public class AccountHeadServiceImpl implements AccountHeadService
{
	@Autowired
	AccountHeadRepository ar;

	@Override
	public AccountHead saveAccountHead(AccountHead ac) {
		
		return ar.save(ac);
	}

	@Override
	public List<AccountHead> getAccountHead() {
		
		return ar.findAll();
	}

}

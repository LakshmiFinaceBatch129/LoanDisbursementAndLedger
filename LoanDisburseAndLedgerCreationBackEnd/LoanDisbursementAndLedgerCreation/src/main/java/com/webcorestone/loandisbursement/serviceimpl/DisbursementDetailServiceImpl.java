package com.webcorestone.loandisbursement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.model.DisbursementDetails;
import com.webcorestone.loandisbursement.repository.DisbursementDetailsRepository;
import com.webcorestone.loandisbursement.service.DisbursementDetailService;
@Service
public class DisbursementDetailServiceImpl implements DisbursementDetailService
{
	@Autowired
	DisbursementDetailsRepository dd;

	@Override
	public DisbursementDetails saveDisbursementDetail(DisbursementDetails d) {
	
		return dd.save(d);
	}

	@Override
	public List<DisbursementDetails> getDisburseDetails() 
	{
		List<DisbursementDetails> list=(List<DisbursementDetails>) dd.findAll();
		
		return list;
	}

}

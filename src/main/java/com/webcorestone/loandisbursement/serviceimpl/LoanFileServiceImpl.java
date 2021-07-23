package com.webcorestone.loandisbursement.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.model.LoanFile;
import com.webcorestone.loandisbursement.repository.LoanFileRepository;
import com.webcorestone.loandisbursement.service.LoanFileService;
@Service
public class LoanFileServiceImpl implements LoanFileService 
{
	@Autowired
	LoanFileRepository lr;

	@Override
	public LoanFile saveLoanFile(LoanFile loanFile) {
		
		return lr.save(loanFile);
	}

	@Override
	public List<LoanFile> getLoanFile() {
		
	List<LoanFile> list=	lr.findAll();
	List<LoanFile> loanfileList=new ArrayList<>();
	
	for(LoanFile lf:list)
	{
		if(lf.getDisburseStatus().equals("Pending"))
		{
			loanfileList.add(lf);
		}
		
	}
	
		return loanfileList;
		
	}

	@Override
	public void updateCustomer(int id) {
	LoanFile lo=	lr.findByLoanFileId(id);
	lo.setDisburseStatus("Approved");
	lr.save(lo);
		
	}
	
}

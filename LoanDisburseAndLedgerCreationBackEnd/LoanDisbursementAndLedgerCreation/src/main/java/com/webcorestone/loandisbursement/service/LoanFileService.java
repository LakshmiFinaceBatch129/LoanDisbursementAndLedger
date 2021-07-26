package com.webcorestone.loandisbursement.service;

import java.util.List;

import com.webcorestone.loandisbursement.model.LoanFile;

public interface LoanFileService {

	LoanFile saveLoanFile(LoanFile loanFile);

	List<LoanFile> getLoanFile();

	void updateCustomer(int id);

}

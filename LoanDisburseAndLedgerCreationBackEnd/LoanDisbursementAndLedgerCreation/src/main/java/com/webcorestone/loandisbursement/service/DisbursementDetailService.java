package com.webcorestone.loandisbursement.service;

import java.util.List;

import com.webcorestone.loandisbursement.model.DisbursementDetails;

public interface DisbursementDetailService {

	DisbursementDetails saveDisbursementDetail(DisbursementDetails d);

	List<DisbursementDetails> getDisburseDetails();

	
}

package com.webcorestone.loandisbursement.service;

import java.util.List;

import com.webcorestone.loandisbursement.mastermodel.AccountHead;

public interface AccountHeadService {

	AccountHead saveAccountHead(AccountHead ac);

	List<AccountHead> getAccountHead();

}

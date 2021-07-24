package com.webcorestone.loandisbursement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.mastermodel.AccountHead;

@Repository
public interface AccountHeadRepository extends JpaRepository<AccountHead, Integer> 
{

}

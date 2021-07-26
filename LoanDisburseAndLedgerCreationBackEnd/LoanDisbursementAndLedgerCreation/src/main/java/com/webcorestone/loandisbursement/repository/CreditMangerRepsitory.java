package com.webcorestone.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.mastermodel.CreditManager;
@Repository
public interface CreditMangerRepsitory extends JpaRepository<CreditManager, Integer> {

}

package com.webcorestone.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.model.LoanFile;
@Repository
public interface LoanFileRepository extends JpaRepository<LoanFile,Integer> {

	LoanFile findByLoanFileId(int id);

}

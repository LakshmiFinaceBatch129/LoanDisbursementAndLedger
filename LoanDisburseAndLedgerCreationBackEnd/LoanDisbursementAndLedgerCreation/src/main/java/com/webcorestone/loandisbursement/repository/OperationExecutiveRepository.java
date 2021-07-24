package com.webcorestone.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.mastermodel.OperationalExecutive;
@Repository
public interface OperationExecutiveRepository extends JpaRepository<OperationalExecutive, Integer> {

}

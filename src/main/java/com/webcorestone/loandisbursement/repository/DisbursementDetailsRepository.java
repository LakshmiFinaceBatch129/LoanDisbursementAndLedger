package com.webcorestone.loandisbursement.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.model.DisbursementDetails;

@Repository
public interface DisbursementDetailsRepository extends CrudRepository<DisbursementDetails,Integer> 
{

}

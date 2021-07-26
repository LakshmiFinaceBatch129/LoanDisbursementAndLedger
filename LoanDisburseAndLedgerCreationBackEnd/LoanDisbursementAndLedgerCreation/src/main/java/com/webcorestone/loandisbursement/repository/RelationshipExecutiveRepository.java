package com.webcorestone.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.mastermodel.RelationalExecutive;
@Repository
public interface RelationshipExecutiveRepository extends JpaRepository<RelationalExecutive, Integer> {

}

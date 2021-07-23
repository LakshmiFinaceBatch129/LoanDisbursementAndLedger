package com.webcorestone.loandisbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.loandisbursement.mastermodel.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> 
{

	User findByUsername(String username);

}

package com.webcorestone.loandisbursement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.loandisbursement.mastermodel.User;
import com.webcorestone.loandisbursement.repository.UserRepository;
import com.webcorestone.loandisbursement.service.UserService;
@Service
public class UserServiceImpl implements UserService 
{
	@Autowired 
	UserRepository ur;

	@Override
	public User getUser(String username) 
	{
		
		return ur.findByUsername(username);
	}

}

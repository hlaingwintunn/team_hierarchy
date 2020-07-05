package com.user.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.user.demo.dao.UserHierarchyRepository;
import com.user.demo.model.User;

@Service
public class UserHierarchyServiceImpl implements UserHierarchyService{
	private static final Logger logger = LoggerFactory.getLogger(UserHierarchyServiceImpl.class);
	
	private UserHierarchyRepository userHierarchyRepository;
	

	public UserHierarchyRepository getUserHierarchyRepository() {
		return userHierarchyRepository;
	}


	public void setUserHierarchyRepository(UserHierarchyRepository userHierarchyRepository) {
		this.userHierarchyRepository = userHierarchyRepository;
	}



	@Override
	public User createNewUser(User user) {
		return userHierarchyRepository.save(user);
	}

}

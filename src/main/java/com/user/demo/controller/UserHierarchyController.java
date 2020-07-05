package com.user.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.demo.model.User;
import com.user.demo.service.UserHierarchyService;

@RestController
@RequestMapping("/api")
public class UserHierarchyController {
	private static final Logger logger = LoggerFactory.getLogger(UserHierarchyController.class);
	
	@Autowired
	private UserHierarchyService userHierarchyService;

	public UserHierarchyService getUserHierarchyService() {
		return userHierarchyService;
	}

	public void setUserHierarchyService(UserHierarchyService userHierarchyService) {
		this.userHierarchyService = userHierarchyService;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello Spring boot Api";
	}
	

	@PutMapping("/create")
	public User create(User user) {
	    return userHierarchyService.createNewUser(user);
	}
	
}

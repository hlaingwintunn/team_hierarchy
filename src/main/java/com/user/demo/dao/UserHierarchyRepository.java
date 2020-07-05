package com.user.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.model.User;

@Repository
public interface UserHierarchyRepository extends CrudRepository<User, String>{

}

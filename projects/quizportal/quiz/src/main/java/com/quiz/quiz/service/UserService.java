package com.quiz.quiz.service;

import com.quiz.quiz.model.User;
import com.quiz.quiz.model.UserRole;

import java.util.Set;

public interface UserService {

    //for creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);


    //for deleting user
    public void delUser(Long userId);

}

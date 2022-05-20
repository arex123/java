package com.quiz.quiz.service.implement;

import com.quiz.quiz.model.User;
import com.quiz.quiz.model.UserRole;
import com.quiz.quiz.repo.RoleRepository;
import com.quiz.quiz.repo.UserRepository;
import com.quiz.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;


@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if(local!=null){
            System.out.println("user is already there !!");
            throw new Exception("User already present !!");
        }else{
            //creating user
            for(UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);


        }
        return local;

    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void delUser(Long userId) {
        this.userRepository.deleteById(userId);
    }


}

package com.mym.consulting.services;

import com.mym.consulting.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String validateUser(String user, String password){

        return (String) this.userRepository.findUserByUserAndPassword(user, password);
    }
}

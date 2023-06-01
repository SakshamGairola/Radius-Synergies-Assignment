package com.getUser.getUserAPI.serviceImpl.UserServiceImpl;

import com.getUser.getUserAPI.model.User;
import com.getUser.getUserAPI.repository.UserRepository;
import com.getUser.getUserAPI.service.UserService.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUserServiceImpl implements GetUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        User user = null;
        if(this.userRepository.existsById(id)){
            user = this.userRepository.findById(id).get();
        }

        return user;
    }
}

package com.getUser.getUserAPI.service.UserService;

import com.getUser.getUserAPI.model.User;

import java.util.List;

public interface GetUserService {
    List<User> getAllUser();
    User getUserById(Long id);
}

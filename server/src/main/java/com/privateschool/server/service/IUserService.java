package com.privateschool.server.service;

import com.privateschool.server.model.Role;
import com.privateschool.server.model.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);

    User changeRole(Role newRole, String username);

    User findByUsername(String username);

    User deleteUser(Long userId);

    List<User> findAllUsers();

}

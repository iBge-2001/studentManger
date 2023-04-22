package com.lin.service;

import com.lin.domain.User;

import java.util.List;

public interface UserService {
    public User selectOneUser(String user);
    public List<User> getAll();
}

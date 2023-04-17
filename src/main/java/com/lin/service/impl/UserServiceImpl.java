package com.lin.service.impl;

import com.lin.dao.UserDao;
import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectOneUser(String user) {
        User user1 = userDao.selectOneUser(user);
        return user1;
    }
}

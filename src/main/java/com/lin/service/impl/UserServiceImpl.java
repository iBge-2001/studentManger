package com.lin.service.impl;

import com.lin.dao.UserDao;
import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectOneUser(String user) {
        return userDao.selectOneUser(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public Boolean save(User user) {
        return userDao.saveUser(user)>0;
    }

    @Override
    public Boolean updatePwd(User user) {
        return userDao.updatePwd(user)>0;
    }

    @Override
    public Boolean Delete(String user) {
        return userDao.Delete(user)>0;
    }
}

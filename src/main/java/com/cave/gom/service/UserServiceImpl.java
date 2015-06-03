package com.cave.gom.service;

import com.cave.gom.dao.UserDao;
import com.cave.gom.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sleepbear on 2015-06-01.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public User getUser(String id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public boolean memberCheck(String id, String password) {
        User user = userDao.findById(id);
        if( user != null) {
            return user.getPassword().equals(password);
        }
        return false;
    }
}

package com.cave.gom.service;

import com.cave.gom.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by sleepbear on 2015-06-01.
 */
public interface UserService {
    void addUser(User user);

    User getUser(String id);

    boolean memberCheck(String id, String password);
}

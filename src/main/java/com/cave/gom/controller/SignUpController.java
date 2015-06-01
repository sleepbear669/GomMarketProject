package com.cave.gom.controller;

import com.cave.gom.model.User;
import com.cave.gom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sleepbear on 2015-06-01.
 */
@Controller
public class SignUpController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/signUpAction", method = RequestMethod.POST)
    public String signUp(User user) {
        String id = user.getId();
        if(userService.getUser(id) != null){
            return "signUp";
        }
        userService.addUser(user);
        return "redirect:/productList";
    }
}

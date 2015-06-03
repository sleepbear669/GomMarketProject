package com.cave.gom.controller;

import com.cave.gom.model.User;
import com.cave.gom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by sleepbear on 2015-06-03.
 */
@Controller
public class SignInController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/signInAction", method = RequestMethod.POST)
    public String signInCheck(String id, String password, HttpSession httpSession) {
        if(userService.memberCheck(id, password)) {
            User user = userService.getUser(id);
            httpSession.setAttribute("user", user);
            return "redirect:/productList";
        }
        return "signIn";
    }

}

package com.cave.gom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by sleepbear on 2015-06-04.
 */
@Controller
public class LogoutController {

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.removeAttribute("user");
        return "redirect:/productList";
    }
}

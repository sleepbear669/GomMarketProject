package com.cave.gom.controller;

import com.cave.gom.service.ProductService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sleepbear on 2015-06-02.
 */
@Controller
public class ProductRemoveController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String removeProduct(int id) {
        productService.remove(id);
        return "redirect:/productList";
    }
}

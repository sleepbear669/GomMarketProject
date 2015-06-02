package com.cave.gom.controller;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sleepbear on 2015-06-01.
 */
@Controller
public class ProductRegisterController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/productRegisterAction", method = RequestMethod.POST)
    public String register(Product product) {
        productService.register(product);
        return "redirect:/productList";
    }


}

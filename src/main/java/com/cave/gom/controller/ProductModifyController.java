package com.cave.gom.controller;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sleepbear on 2015-06-02.
 */
@Controller
public class ProductModifyController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public ModelAndView productModify(int id) {
        ModelAndView modelAndView = new ModelAndView();
        Product product = productService.getProductById(id);
        modelAndView.setViewName("productRegister");
        modelAndView.addObject(product);
        return modelAndView;
    }
}

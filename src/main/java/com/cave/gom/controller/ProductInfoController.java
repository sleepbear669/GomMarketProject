package com.cave.gom.controller;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sleepbear on 2015-06-02.
 */
@Controller
public class ProductInfoController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "productInfo", method = RequestMethod.GET)
    public Product productInfo(int id) {
        return productService.getProductById(id);
    }

}

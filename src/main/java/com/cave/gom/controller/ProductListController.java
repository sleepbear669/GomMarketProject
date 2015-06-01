package com.cave.gom.controller;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-01.
 */

@Controller
public class ProductListController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/productList")
    public List<Product> productList(ModelMap modelMap){
        return productService.getProducts();
    }
}

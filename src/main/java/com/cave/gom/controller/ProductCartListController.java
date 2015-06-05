package com.cave.gom.controller;

import com.cave.gom.model.Cart;
import com.cave.gom.model.Product;
import com.cave.gom.model.User;
import com.cave.gom.service.CartService;
import com.cave.gom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sleepbear on 2015-06-05.
 */
@Controller
public class ProductCartListController {

    @Autowired
    CartService cartService;
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/productCartList", method = RequestMethod.GET)
    public List<Product> cartList(String buyer_id, int id) {
        Cart cart = new Cart(buyer_id, id);
        cartService.addCardList(cart);
        List<Cart> cartList = cartService.getCartList(buyer_id);
        List<Product> productList = new ArrayList<Product>();
        for (int i = 0; i < cartList.size(); i++) {
            Product product = productService.getProductById(cartList.get(i).getProduct_id());
            System.out.println(product.getProduct_id());
            productList.add(product);
        }
        return productList;
    }
}

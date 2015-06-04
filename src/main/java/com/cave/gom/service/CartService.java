package com.cave.gom.service;

import com.cave.gom.model.Cart;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-05.
 */
public interface CartService {
    List<Cart> getCartList(String buyerId);

    void addCardList(Cart cart);

    void buy(String buyerId);
}

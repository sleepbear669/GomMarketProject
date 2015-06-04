package com.cave.gom.service;

import com.cave.gom.dao.CartDao;
import com.cave.gom.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-05.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDao cartDao;

    @Override
    public List<Cart> getCartList(String buyerId) {
        return cartDao.findAllById(buyerId);
    }

    @Override
    public void addCardList(Cart cart) {
        cartDao.insert(cart);
    }

    @Override
    public void buy(String buyerId) {
        cartDao.deleteById(buyerId);
    }
}

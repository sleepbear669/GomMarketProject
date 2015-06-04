package com.cave.gom.dao;

import com.cave.gom.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-04.
 */
@Repository
public interface CartDao {
    void insert(Cart cart);

    List<Cart> findAllById(String buyerId);

    void deleteById(String buyerId);
}

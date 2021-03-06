package com.cave.gom.service;

import com.cave.gom.model.Product;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-01.
 */
public interface ProductService {
    List<Product> getProducts();

    void register(Product product);

    void remove(int product_id);

    void modify(Product product);

    Product getProductById(int id);
}

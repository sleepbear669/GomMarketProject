package com.cave.gom.dao;

import com.cave.gom.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-01.
 */
@Repository
public interface ProductDao {
    List<Product> FindAll();

    int count();

    void insert(Product product);
}

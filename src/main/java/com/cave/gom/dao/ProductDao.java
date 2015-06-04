package com.cave.gom.dao;

import com.cave.gom.model.Product;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-01.
 */
@Repository
public interface ProductDao {
    List<Product> findAll();

    int count();

    void insert(Product product);

    void delete(int product_id);

    Product findById(int product_id);

    void update(Product product);
}

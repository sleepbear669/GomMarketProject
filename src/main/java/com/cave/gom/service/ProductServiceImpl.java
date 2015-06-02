package com.cave.gom.service;

import com.cave.gom.dao.ProductDao;
import com.cave.gom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sleepbear on 2015-06-01.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
    }

    @Override
    public void register(Product product) {
        productDao.insert(product);
    }

    @Override
    public void remove(int product_id) {
        productDao.delete(product_id);
    }

    @Override
    public void modify(Product product) {
        productDao.update(product);
    }

    @Override
    public Product getProductById(int id) {
        return productDao.findById(id);
    }
}

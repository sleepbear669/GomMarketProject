package com.cave.gom.service;

import com.cave.gom.dao.ProductDao;
import com.cave.gom.dao.UserDao;
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
        return productDao.getProductList();
    }
}

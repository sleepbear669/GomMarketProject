package com.cave.gom;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by sleepbear on 2015-06-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class productServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetProductList() throws Exception {
        List<Product> productList = productService.getProducts();
        assertNotNull("is null", productList);
    }
}

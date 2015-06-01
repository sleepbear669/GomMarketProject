package com.cave.gom;

import com.cave.gom.model.Product;
import com.cave.gom.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

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

    @Test
    public void testProductRegister() throws Exception {
        String product_name = "123";
        String seller_id = "sleepbear";
        String contents = "1";
        String image = null;
        int price = 1;
        Product product = new Product(product_name, seller_id, contents, image, price);
        int count = productService.getProducts().size();
        productService.register(product);
        assertThat(count+1 , is(productService.getProducts().size()));
    }
}

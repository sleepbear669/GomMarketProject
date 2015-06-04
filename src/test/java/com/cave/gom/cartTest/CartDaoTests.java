package com.cave.gom.cartTest;

import com.cave.gom.dao.CartDao;
import com.cave.gom.model.Cart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by sleepbear on 2015-06-04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:zsrc/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class CartDaoTests {

    @Autowired
    CartDao cartDao;

    @Test
    public void testIsCartDaoNotNull() throws Exception {
        assertNotNull(cartDao);
    }

    @Test
    public void testInsertCartList() throws Exception {
        String buyerId = "tester";
        int productId = 4;

        Cart cart = new Cart(buyerId, productId);
        cartDao.insert(cart);
        List<Cart> cartList = cartDao.findAllById(buyerId);
        cartDao.deleteById(buyerId);
        assertThat(cartList.size(), is(1));
    }
}

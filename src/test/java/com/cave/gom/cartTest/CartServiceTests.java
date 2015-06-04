package com.cave.gom.cartTest;

import com.cave.gom.dao.CartDao;
import com.cave.gom.model.Cart;
import com.cave.gom.service.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Created by sleepbear on 2015-06-05.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class CartServiceTests {

    @Autowired
    CartService cartService;

    @Test
    public void testCartServiceNotNull() throws Exception {
        assertNotNull(cartService);
    }

    @Test
    public void testAddCartList() throws Exception {
        String buyerId = "tester";
        int productId = 4;
        Cart cart = new Cart(buyerId, productId);
        List<Cart> cartList = cartService.getCartList(buyerId);
        int count = cartList.size();
        cartService.addCardList(cart);
        cartList = cartService.getCartList(buyerId);
        assertThat(count+1, is(cartList.size()) );
    }

    @Test
    public void testBuy() throws Exception {
        String buyerId = "tester";
        cartService.buy(buyerId);
        assertThat(cartService.getCartList(buyerId).size(), is(0));
    }
}

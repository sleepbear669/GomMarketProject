package com.cave.gom.cartTest;

import com.cave.gom.dao.CartDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by sleepbear on 2015-06-04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class CartDaoTests {

    @Autowired
    CartDao cartDao;

    @Test
    public void testIsCartDaoNotNull() throws Exception {
        assertNotNull(cartDao);
    }
}

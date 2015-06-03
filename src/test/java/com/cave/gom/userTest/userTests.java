package com.cave.gom.userTest;

import com.cave.gom.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by sleepbear on 2015-06-03.
 */

public class userTests {

    User userSeller, userBuyer;

    @Before
    public void initUser(){
        String sellerId = "gom";
        String sellerName = "허윤호";
        String sellerPassword = "111";
        String sellerType = "seller";
        userSeller = new User(sellerId, sellerName, sellerPassword, sellerType);

        String buyerId = "gom";
        String buyerName = "허윤호";
        String buyerPassword = "111";
        String buyerType = "buyer";
        userBuyer = new User(buyerId, buyerName, buyerPassword, buyerType);

    }

    @Test
    public void testIsUserType() throws Exception {
        assertTrue(userSeller.isSeller());
        assertFalse(userSeller.isBuyer());

    }
}

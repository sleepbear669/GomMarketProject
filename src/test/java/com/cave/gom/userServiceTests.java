package com.cave.gom;

import com.cave.gom.model.User;
import com.cave.gom.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by sleepbear on 2015-06-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class userServiceTests {

    @Autowired
    UserService userService;

    @Test
    public void testAddUserService() throws Exception {
        String id = String.valueOf(new Random().nextInt());
        String name = "허윤호";
        String password = "111";
        String type = "seller";
        User user = new User(id, name, password, type);
        userService.addUser(user);
        User getUser = userService.getUser(id);

        assertThat(getUser.getId(), is(user.getId()));
        assertThat(getUser.getName(), is(user.getName()));
        assertThat(getUser.getPassword(), is(user.getPassword()));
        assertThat(getUser.getType(), is(user.getType()));
    }

    @Test
    public void testMemberCheck() throws Exception {
        String id = String.valueOf(new Random().nextInt());
        String name = "허윤호";
        String password = "111";
        String type = "seller";
        User user = new User(id, name, password, type);
        userService.addUser(user);

        assertTrue(userService.memberCheck(id, password));
        assertFalse(userService.memberCheck(id, "1234"));

    }
}

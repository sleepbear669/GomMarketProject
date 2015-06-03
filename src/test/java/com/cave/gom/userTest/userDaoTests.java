package com.cave.gom.userTest;

import com.cave.gom.dao.UserDao;
import com.cave.gom.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sleepbear on 2015-05-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class userDaoTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserById() throws Exception {
        String id = "gom";
        User user = userDao.findById(id);
        assertThat(user.getId(), is("gom"));
        assertThat(user.getName(), is("kim"));
        assertThat(user.getPassword(), is("1234"));
        assertThat(user.getType(), is("seller"));
    }

    @Test
    public void testInsertUser() throws Exception {
        String id = String.valueOf(new Random().nextInt());
        String name = "허윤호";
        String password = "111";
        String type = "seller";
        User user = new User(id, name, password, type);
        userDao.insert(user);

        User resultUser = userDao.findById(id);
        assertThat(resultUser.getId(), is(user.getId()));
        assertThat(resultUser.getName(), is(user.getName()));
        assertThat(resultUser.getPassword(), is(user.getPassword()));
        assertThat(resultUser.getType(), is(user.getType()));
    }
}

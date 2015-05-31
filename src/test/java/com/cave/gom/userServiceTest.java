package com.cave.gom;

import com.cave.gom.dao.UserDao;
import com.cave.gom.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sleepbear on 2015-05-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class userServiceTest {

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
}

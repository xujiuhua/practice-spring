package com.ebiz.service;

import com.ebiz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:remote-client.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
        User user = userService.getUser("test");
        assertEquals("test", user.getUsername());
    }
}

package com.ebiz;

import com.ebiz.entity.User;
import com.ebiz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "classpath*:remote-client.xml");
        UserService userService = (UserService)ac.getBean("userService");
        User user = userService.getUser("123");
        System.out.println(user);
    }

}

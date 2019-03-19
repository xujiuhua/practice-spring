package com.springboot.fm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@Controller
public class I18nController {
    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}

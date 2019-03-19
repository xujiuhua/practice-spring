package com.springboot.thy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@Controller
public class PageController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/international")
    public String getInternationalPage() {
        return "international";
    }

    @GetMapping("hello")
    public String hello(Model model) {
        Locale locale = LocaleContextHolder.getLocale();
        model.addAttribute("world", messageSource.getMessage("world", null, locale));
        return "hello";
    }
}

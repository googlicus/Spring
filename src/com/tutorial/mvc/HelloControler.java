package com.tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danil.karimov on 30.01.2018.
 */
@Controller
@RequestMapping("/hello")
public class HelloControler {
    @RequestMapping(method =RequestMethod.GET )
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Heelo man!");
        return "hello";
    }
}

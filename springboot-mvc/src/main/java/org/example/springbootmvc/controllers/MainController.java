package org.example.springbootmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    // http://localhost:8080/home1
    @RequestMapping("/home1")
    public String home(Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        return "home.html";
    }

    // http://localhost:8080/home2?color=blue
    @RequestMapping("home2")
    public String home2(@RequestParam String color, Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "home.html";
    }

    // http://localhost:8080/home3?color=blue&name=Jane
    @RequestMapping("home3")
    public String home3(@RequestParam(required = false) String name,
                        @RequestParam(required = false) String color,
                        Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }

    // http://localhost:8080/home/red
    @RequestMapping("home/{color}")
    public String home4(@PathVariable String color, Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "home.html";
    }
}

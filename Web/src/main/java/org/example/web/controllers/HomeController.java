package org.example.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Test() {
        return "home";
    }

    @GetMapping("/about")
    public String Test2() {
        return "about";
    }
    @GetMapping("/news")
    public String Test3() {
        return "news";
    }

    @GetMapping("/contact")
    public String Test4() {
        return "contact";
    }

    @GetMapping("/teachers")
    public String Test5() {
        return "teachers";
    }

    @GetMapping("/resources")
    public String Test6() {
        return "resources";
    }

    @GetMapping("/events")
    public String Test7() {
        return "events";
    }
}

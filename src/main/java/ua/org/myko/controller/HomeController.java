package ua.org.myko.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m.bova on 07.02.17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello, World!";
    }
}

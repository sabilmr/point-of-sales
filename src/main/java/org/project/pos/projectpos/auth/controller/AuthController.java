package org.project.pos.projectpos.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AuthController {

    @GetMapping
    public String login() {
        return "pages/auth/login";
    }

    @GetMapping("/forget")
    public String forget() {
        return "pages/auth/forget";
    }
}

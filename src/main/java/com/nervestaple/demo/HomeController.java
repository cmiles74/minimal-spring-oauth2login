package com.nervestaple.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        var oidcUser = (OidcUser) authentication.getPrincipal();
        model.addAttribute("accountName", oidcUser.getPreferredUsername());
        return "index";
    }

    @GetMapping("/goodbye")
    public String goodbye(Model model) {
        return "goodbye";
    }
}

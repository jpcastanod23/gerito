package com.gerito.Controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChooseTemplateController {
    @GetMapping("/chooseTemplate")
    public String chooseTemplate(@RequestParam(value = "speakers") int speakers, @RequestParam(value = "name") String name,
                                 Model model, HttpServletResponse response) {
        model.addAttribute("speakers", speakers);
        model.addAttribute("userName", name);
        Cookie userName = new Cookie("userName", name);//creating cookie object
        response.addCookie(userName);
        return "chooseTemplate";
    }
}

package com.gerito.Controllers;

import com.gerito.Services.CookieService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SelectTemplateController {
    @Autowired
    CookieService cookieService;

    @GetMapping("/selectTemplate")
    public String selectTemplate(@RequestParam(value = "img") int img, @RequestParam(value = "speakers") int speakers,
                                 HttpServletRequest request, Model model) {
        model.addAttribute("img", img);
        model.addAttribute("speakers", speakers);
        model.addAttribute("isTemplateSelected", true);
        model.addAttribute("userName", cookieService.getCookieName(request));
        return "botAssistant";
    }
}

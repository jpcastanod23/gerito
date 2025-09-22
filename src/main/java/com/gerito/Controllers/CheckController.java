package com.gerito.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CheckController {
    @GetMapping("/check")
    public String check(@RequestParam(value = "success", required = false) boolean success, Model model) {
        if (success) {
            model.addAttribute("success", true);
        }
        return "checkFeature";
    }
}

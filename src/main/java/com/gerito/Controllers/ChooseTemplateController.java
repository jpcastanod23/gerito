package com.gerito.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChooseTemplateController {
    @GetMapping("/chooseTemplate")
    public String chooseTemplate(@RequestParam(value = "speakers", defaultValue = "1", required = true) int speakers, Model model) {
        model.addAttribute("speakers", speakers);
        return "chooseTemplate";
    }
}

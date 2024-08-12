package com.gerito.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BotAssistantController {
    @GetMapping("/botAssistant")
    public String botAssistant() {
        return "botAssistant";
    }
}

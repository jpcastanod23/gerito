package com.gerito.Controllers;

import com.gerito.Services.ImageService;
import com.gerito.Services.TemplateService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ChooseTemplateController {

    @Autowired
    TemplateService templateService;
    @Autowired
    ImageService imageService;
    @GetMapping("/chooseTemplate")
    public String chooseTemplate(@RequestParam(value = "speakers") int speakers, @RequestParam(value = "name") String name,
                                 Model model, HttpServletResponse response) {
        model.addAttribute("speakers", speakers);
        model.addAttribute("userName", name);
        Cookie userName = new Cookie("userName", name);
        response.addCookie(userName);
        return "chooseTemplate";
    }

    public String testingCustomRules(@RequestParam(value = "speakers") int speakers, @RequestParam(value = "name") String name,
                                     Model model, HttpServletResponse response){
        model.addAttribute("speakers", speakers);
        model.addAttribute("userName", name);
        templateService.createListOfSpeakers(3);
        if(speakers == 3){
            System.out.println("istrhee");
        }
        else if (speakers == 2){
            System.out.println("istwo");
        }
        else{
            System.out.println("is none");
        }
        System.out.println(speakers);
        System.out.println(name);
        Cookie cookie = new Cookie("userName", name);
        response.addCookie(new Cookie("speakers", speakers+""));
        System.out.println(cookie.getValue());
        return "chooseTemplate";
    }
}

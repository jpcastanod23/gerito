package com.gerito.Controllers;

import com.gerito.Models.TemplateModel;
import com.gerito.Services.CookieService;
import com.gerito.Services.TemplateService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FillTemplateController {
    @Autowired
    TemplateService templateService;

    @GetMapping("/fillTemplate")
    public String selectTemplate(@RequestParam(value = "img") int img, @RequestParam(value = "speakers") int speakers,
                                 HttpServletRequest request, Model model) {

        TemplateModel templateModel = new TemplateModel();

        model.addAttribute("img", img);
        model.addAttribute("speakers", speakers);
        templateModel.setSpeakers(templateService.createListOfSpeakers(speakers));
        model.addAttribute("template", templateModel);
        return "fillTemplate";
    }

    @PostMapping("/createTemplate")
    public String submitForm(@ModelAttribute("template") TemplateModel template) {

        System.out.println(template);

        return "register_success";
    }
}

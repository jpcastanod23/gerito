package com.gerito.Controllers;

import com.gerito.Models.TemplateInformationModel;
import com.gerito.Models.TemplateModel;
import com.gerito.Services.TemplateService;
import com.gerito.Services.TextCleanService;
import com.gerito.Services.impl.DefaultImageService;
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
    TextCleanService textCleanService;

    DefaultImageService imageService;

    @GetMapping("/chooseTemplate")
    public String chooseTemplate(@RequestParam(value = "speakers") int speakers, @RequestParam(value = "name") String name,
                                 Model model, HttpServletResponse response) {
        model.addAttribute("speakers", speakers);
        model.addAttribute("userName", name);
        textCleanService.cleanName(name);
        textCleanService.convertSpeakers(speakers);
        Cookie userName = new Cookie("userName", name);
        imageService.writeText(2, 3, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 4, new TemplateInformationModel(), new TemplateModel());
        imageService.writeText(2, 7, new TemplateInformationModel(), new TemplateModel());
        System.out.println(userName.getValue());

        response.addCookie(userName);
        return "chooseTemplate";
    }
}

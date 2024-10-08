package com.gerito.Controllers;

import com.gerito.Models.TemplateInformationModel;
import com.gerito.Models.TemplateModel;
import com.gerito.Services.ImageService;
import com.gerito.Services.TemplateService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class FillTemplateController {
    @Autowired
    TemplateService templateService;
    @Autowired
    ImageService imageService;

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
    public String submitForm(@RequestParam(value = "img") int img, @RequestParam(value = "spkrs") int spkrs
                             ,@ModelAttribute("template") TemplateModel template) throws IOException {

        TemplateInformationModel templateInformationModel = templateService.getTemplateInformationModel(spkrs, img);
        imageService.writeText(spkrs, img, templateInformationModel, template);

        return "register_success";
    }
}

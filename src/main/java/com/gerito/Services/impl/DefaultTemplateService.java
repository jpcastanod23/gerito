package com.gerito.Services.impl;

import com.gerito.Models.ComponentModel;
import com.gerito.Models.SpeakerModel;
import com.gerito.Models.TemplateInformationModel;
import com.gerito.Services.TemplateService;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultTemplateService implements TemplateService {
    @Override
    public List<SpeakerModel> createListOfSpeakers(int speakersCount) {
        List<SpeakerModel> speakers = new ArrayList<>();
        for (int i = 0; i < speakersCount; i++) {
            SpeakerModel speaker = new SpeakerModel();
            speakers.add(speaker);
        }
        return speakers;
    }

    @Override
    public TemplateInformationModel getTemplateInformationModel(int speakers, int img) {
        return createTemplate(speakers, img);
    }



    private TemplateInformationModel createTemplate(int speakers, int img) {
        TemplateInformationModel template = new TemplateInformationModel();

        if(speakers == 1 && img == 1) {
            template.setTemplateName("Template1-1");
            setComponentsTemplate1(template);
        }

        else if(speakers == 1 && img == 2) {
            template.setTemplateName("Template1-2");
            setComponentsTemplate2(template);
        }

        else if(speakers == 1 && img == 3) {
            template.setTemplateName("Template1-3");
            setComponentsTemplate3(template);
        }

        else if(speakers == 2 && img == 1) {
            template.setTemplateName("Template2-1");
            setComponentsTemplate4(template);
        }

        else if(speakers == 2 && img == 2) {
            template.setTemplateName("Template2-2");
            setComponentsTemplate5(template);
        }

        else if(speakers == 2 && img == 3) {
            template.setTemplateName("Template2-3");
            setComponentsTemplate6(template);
        }

        else if(speakers == 3 && img == 1) {
            template.setTemplateName("Template3-1");
            setComponentsTemplate7(template);
        }
        else if(speakers == 3 && img == 2) {
            template.setTemplateName("Template3-2");
            setComponentsTemplate8(template);
        }

        else if(speakers == 3 && img == 3) {
            template.setTemplateName("Template3-3");
            setComponentsTemplate9(template);
        }

        return template;
    }


    private void setComponentsTemplate1(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 84, 283, 76,
                new Color(181, 51, 253), "Arial", 15 );
        ComponentModel description = createComponent("description", 84, 408, 84,
                new Color(3, 83, 202), "Arial", 14 );
        ComponentModel date = createComponent("date", 240, 3075, 53,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel time = createComponent("time", 878, 3075, 60,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel place = createComponent("place", 1480, 3075, 60,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel name = createComponent("name", 1317, 2142, 60,
                new Color(0, 236, 253), "Arial", 25 );
        ComponentModel role = createComponent("role", 1305, 2345, 60,
                new Color(255, 255, 255), "Arial", 23 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate2(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 1111, 1853, 80,
                new Color(0, 238, 255), "Arial", 23 );
        ComponentModel description = createComponent("description", 1111, 1961, 80,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel date = createComponent("date", 1000, 2817, 70,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel time = createComponent("time", 1000, 2970, 70,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel place = createComponent("place", 1000, 3123, 70,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel name = createComponent("name", 1450, 1278, 61,
                new Color(255, 255, 255), "Arial", 25 );
        ComponentModel role = createComponent("role", 1450, 1364, 61,
                new Color(255, 255, 255), "Arial", 20 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate3(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 35, 35, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel description = createComponent("description", 70, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 90, 90, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel time = createComponent("time", 120, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel place = createComponent("place", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name = createComponent("name", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role = createComponent("role", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate4(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 35, 35, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel description = createComponent("description", 70, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 90, 90, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel time = createComponent("time", 120, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel place = createComponent("place", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name = createComponent("name", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role = createComponent("role", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name2 = createComponent("name2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role2 = createComponent("role2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate5(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 35, 35, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel description = createComponent("description", 70, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 90, 90, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel time = createComponent("time", 120, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel place = createComponent("place", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name = createComponent("name", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role = createComponent("role", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name2 = createComponent("name2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role2 = createComponent("role2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate6(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 143, 312, 89,
                new Color(0, 0, 0), "Arial", 24 );
        ComponentModel description = createComponent("description", 70, 120, 20,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 412, 831, 60,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel time = createComponent("time", 412, 953, 60,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel place = createComponent("place", 402, 1078, 60,
                new Color(255, 255, 255), "Arial", 23 );
        ComponentModel name = createComponent("name", 380, 2890, 57,
                new Color(23, 30, 50), "Arial", 30 );
        ComponentModel role = createComponent("role", 380, 2951, 50,
                new Color(23, 30, 50), "Arial", 25 );
        ComponentModel name2 = createComponent("name2", 1456, 2890, 57,
                new Color(23, 30, 50), "Arial", 30 );
        ComponentModel role2 = createComponent("role2", 1456, 2951, 50,
                new Color(23, 30, 50), "Arial", 25 );

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
        templateInformationModel.getComponents().add(name2);
        templateInformationModel.getComponents().add(role2);
    }

    private void setComponentsTemplate7(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 865, 760, 100,
                new Color(255, 255, 255), "Arial", 14 );
        ComponentModel description = createComponent("description", 271, 1931, 50,
                new Color(0, 0, 0), "Arial", 35 );
        ComponentModel date = createComponent("date", 420, 2499, 60,
                new Color(0, 0, 0), "Arial", 23 );
        ComponentModel time = createComponent("time", 420, 2686, 60,
                new Color(0, 0, 0), "Arial", 23 );
        ComponentModel place = createComponent("place", 420, 2893, 60,
                new Color(0, 0, 0), "Arial", 23 );
        ComponentModel name = createComponent("name", 1614, 2062, 40,
                new Color(23, 30, 50), "Arial", 35 );
        ComponentModel role = createComponent("role", 1538, 2116, 40,
                new Color(23, 30, 50), "Arial", 35 );
        ComponentModel name2 = createComponent("name2", 1614, 2623, 40,
                new Color(23, 30, 50), "Arial", 35 );
        ComponentModel role2 = createComponent("role2", 1538, 2677, 40,
                new Color(23, 30, 50), "Arial", 35 );
        ComponentModel name3 = createComponent("name3", 1614, 3140, 40,
                new Color(23, 30, 50), "Arial", 35 );
        ComponentModel role3 = createComponent("role3", 1538, 3194, 40,
                new Color(23, 30, 50), "Arial", 35 );
        addComponents(templateInformationModel, title, description, date, time, place, name, role);
        templateInformationModel.getComponents().add(name3);
        templateInformationModel.getComponents().add(role3);
        templateInformationModel.getComponents().add(name2);
        templateInformationModel.getComponents().add(role2);
    }

    private void setComponentsTemplate8(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 35, 35, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel description = createComponent("description", 70, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 90, 90, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel time = createComponent("time", 120, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel place = createComponent("place", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name = createComponent("name", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role = createComponent("role", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name2 = createComponent("name2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role2 = createComponent("role2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name3 = createComponent("name3", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role3 = createComponent("role3", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        addComponents(templateInformationModel, title, description, date, time, place, name, role);

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }

    private void setComponentsTemplate9(TemplateInformationModel templateInformationModel) {
        ComponentModel title = createComponent("title", 35, 35, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel description = createComponent("description", 70, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel date = createComponent("date", 90, 90, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel time = createComponent("time", 120, 120, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel place = createComponent("place", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name = createComponent("name", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role = createComponent("role", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name2 = createComponent("name2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role2 = createComponent("role2", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel name3 = createComponent("name3", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        ComponentModel role3 = createComponent("role3", 30, 30, 30,
                new Color(23, 30, 50), "Arial", 23 );
        addComponents(templateInformationModel, title, description, date, time, place, name, role);

        addComponents(templateInformationModel, title, description, date, time, place, name, role);
    }



        private ComponentModel createComponent(String id, int x, int y, int fontSize, Color fontColor, String fontFamily, int maxChar) {
        ComponentModel componentModel = new ComponentModel();
        componentModel.setId(id);
        componentModel.setX(x);
        componentModel.setY(y);
        componentModel.setFontSize(fontSize);
        componentModel.setFontColor(fontColor);
        componentModel.setFontFamily(fontFamily);
        componentModel.setMaxCharPerLine(maxChar);
        return componentModel;
    }

    private void addComponents(TemplateInformationModel templateInformationModel, ComponentModel title, ComponentModel description, ComponentModel date, ComponentModel time, ComponentModel place, ComponentModel name, ComponentModel role) {
        List<ComponentModel> components = new ArrayList<>();
        components.add(title);
        components.add(description);
        components.add(date);
        components.add(time);
        components.add(place);
        components.add(name);
        components.add(role);
        components.add(name);
        components.add(role);

        templateInformationModel.setComponents(components);
    }
}

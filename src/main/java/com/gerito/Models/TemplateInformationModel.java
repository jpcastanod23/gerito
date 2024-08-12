package com.gerito.Models;

import java.util.List;

public class TemplateInformationModel {
    private String templateName;
    List<ComponentModel> components;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public List<ComponentModel> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentModel> components) {
        this.components = components;
    }

}

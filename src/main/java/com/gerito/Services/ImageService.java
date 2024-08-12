package com.gerito.Services;

import com.gerito.Models.TemplateInformationModel;
import com.gerito.Models.TemplateModel;

import java.io.IOException;

public interface ImageService {
    void writeText(int speakers, int img, TemplateInformationModel templateInformationModel, TemplateModel templateModel) throws IOException;
}

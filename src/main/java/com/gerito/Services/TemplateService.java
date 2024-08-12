package com.gerito.Services;

import com.gerito.Models.SpeakerModel;
import com.gerito.Models.TemplateInformationModel;
import com.gerito.Models.TemplateModel;

import java.util.List;

public interface TemplateService {
    List<SpeakerModel> createListOfSpeakers(int speakersCount);

    TemplateInformationModel getTemplateInformationModel(int speakers, int img);
}

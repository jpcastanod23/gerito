package com.gerito.Services;

import com.gerito.Models.SpeakerModel;

import java.util.List;

public interface TemplateService {
    List<SpeakerModel> createListOfSpeakers(int speakersCount);
}

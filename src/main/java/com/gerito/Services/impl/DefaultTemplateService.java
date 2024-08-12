package com.gerito.Services.impl;

import com.gerito.Models.SpeakerModel;
import com.gerito.Services.TemplateService;
import org.springframework.stereotype.Service;

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
}

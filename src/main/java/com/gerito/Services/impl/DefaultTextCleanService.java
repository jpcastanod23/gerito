package com.gerito.Services.impl;

import com.gerito.Services.TextCleanService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class DefaultTextCleanService implements TextCleanService {
    @Override
    public String cleanName(String name) {
        return StringUtils.trimAllWhitespace(name);
    }

    @Override
    public String convertSpeakers(int speakers) {
        if(speakers == 0) {
            return "cero";
        }
        else if(speakers == 1) {
            return "uno";
        }
        else if(speakers == 1) {
            return "uno";
        }
        else if(speakers == 2) {
            return "dos";
        }
        else if(speakers == 3) {
            return "tres";
        }
        return "cuatro";
    }
}

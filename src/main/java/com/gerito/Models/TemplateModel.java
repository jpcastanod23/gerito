package com.gerito.Models;

import java.sql.Date;
import java.sql.Time;
import java.util.List;


public class TemplateModel {

    private String title;
    private String description;
    private String place;
    private String time;
    private String date;
    private List<SpeakerModel> speakers;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<SpeakerModel> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<SpeakerModel> speakers) {
        this.speakers = speakers;
    }


}

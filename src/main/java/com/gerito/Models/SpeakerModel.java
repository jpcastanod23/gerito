package com.gerito.Models;

import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;

public class SpeakerModel {

    private String name;
    private String role;
    private MultipartFile file;


    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}

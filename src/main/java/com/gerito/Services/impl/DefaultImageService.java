package com.gerito.Services.impl;

import com.gerito.Models.ComponentModel;
import com.gerito.Models.TemplateInformationModel;
import com.gerito.Models.TemplateModel;
import com.gerito.Services.ImageService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DefaultImageService implements ImageService {

    @Override
    public void writeText(int speakers, int img, TemplateInformationModel templateInformationModel, TemplateModel templateModel) throws IOException {

        final BufferedImage image = ImageIO.read(new File("src/main/resources/static/images/templates/template"
                + speakers + "-" + img + ".png"));

        setTextInComponent(getAccurrateComponent(templateInformationModel, "title"), templateModel.getTitle(),false, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "description"), templateModel.getDescription(), true, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "date"), templateModel.getDate(),false, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "time"), templateModel.getTime(), false, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "place"), templateModel.getPlace(), false, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "name"), templateModel.getSpeakers().get(0).getName(), false, image);

        setTextInComponent(getAccurrateComponent(templateInformationModel, "role"), templateModel.getSpeakers().get(0).getRole(), false, image);

        setImagInComponent(getAccurrateComponent(templateInformationModel, "file"), templateModel.getSpeakers().get(0).getFile(), image);

        if (templateModel.getSpeakers().size() > 1) {
            setTextInComponent(getAccurrateComponent(templateInformationModel, "name2"), templateModel.getSpeakers().get(1).getName(), false,  image);
            setTextInComponent(getAccurrateComponent(templateInformationModel, "role2"), templateModel.getSpeakers().get(1).getRole(), false,  image);
            if (templateModel.getSpeakers().size() > 2) {
                setTextInComponent(getAccurrateComponent(templateInformationModel, "name3"), templateModel.getSpeakers().get(2).getName(), false, image);
                setTextInComponent(getAccurrateComponent(templateInformationModel, "role3"), templateModel.getSpeakers().get(2).getRole(), false, image);
            }
        }


        ImageIO.write(image, "png", new File("src/main/resources/static/images/output/" +
                "invitation-" + speakers + "-" + img + ".png"));
    }


    private ComponentModel getAccurrateComponent(TemplateInformationModel templateInformationModel, String key) {
        Optional<ComponentModel> templateInformationModel1 = templateInformationModel.getComponents().stream().
                filter(componentModel -> componentModel.getId().equals(key)).findFirst();

        return templateInformationModel1.orElse(null);

    }


    private void setTextInComponent(ComponentModel componentModel, String text,boolean isDesc, BufferedImage image) {
        if (componentModel != null) {
            Graphics g = image.getGraphics();
            g.setColor(componentModel.getFontColor());
            g.setFont(new Font("Roboto", Font.BOLD, componentModel.getFontSize()));

            if(isDesc){
                g.setFont(new Font(componentModel.getFontFamily(), Font.BOLD, componentModel.getFontSize()));

            }

                g.setColor(componentModel.getFontColor());
            List<String> lines = getLines(text, componentModel.getMaxCharPerLine());
            cleanLines(lines);

            lines.forEach(data -> {
                g.drawString(data, componentModel.getX(), componentModel.getY());
                componentModel.setY(componentModel.getY() + componentModel.getFontSize() + 20);
            });

            g.dispose();
        }
    }

    private void setImagInComponent(ComponentModel componentModel, MultipartFile file, BufferedImage image) throws IOException {
        if (componentModel != null) {
            Graphics g = image.getGraphics();
            Image speakerImage = ImageIO.read(file.getInputStream());

            Image resultingImage = speakerImage.getScaledInstance(835, 905, Image.SCALE_DEFAULT);
            BufferedImage finalImage =  cropImageIntoCircle(resultingImage);

            g.drawImage(finalImage, componentModel.getX(), componentModel.getY(), null);
            g.dispose();
        }
    }

    public BufferedImage cropImageIntoCircle(Image img) {
        int width = img.getWidth(null);
        int height = img.getHeight(null);

        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bi.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int circleDiameter = Math.min(width,height);
        Ellipse2D.Double circle = new Ellipse2D.Double(0,0,circleDiameter,circleDiameter);
        g2.setClip(circle);
        g2.drawImage(img,0,0,null);
        return bi;
    }

    private List<String> getLines(String text, int lineCount) {
        List<String> lines = new ArrayList<>();
        if (text != null) {
            for (int i = 0; i < text.length(); i = i + lineCount) {
                if (text.length() <= i + lineCount) {
                    lines.add(text.substring(i));
                } else {
                    lines.add(text.substring(i, i + lineCount));
                }
            }
        }
        return lines;
    }

    private void cleanLines(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).charAt(0) == ' ') {
                lines.set(i, lines.get(i).substring(1));
            }
        }
    }
}

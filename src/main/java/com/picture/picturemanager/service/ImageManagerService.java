package com.picture.picturemanager.service;

import com.picture.picturemanager.model.ImageDto;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

@Service
public class ImageManagerService {
    public String convertBase64(ImageDto client) {
        String retorno = "";

        try {
            File file = new File(client.getUrlImage());
            FileInputStream imageInFile = new FileInputStream(file);
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            retorno = Base64.getEncoder().encodeToString(fileData);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return retorno;
    }
}

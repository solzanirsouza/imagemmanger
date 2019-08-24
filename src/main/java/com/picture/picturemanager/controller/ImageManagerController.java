package com.picture.picturemanager.controller;

import com.picture.picturemanager.model.ImageDto;
import com.picture.picturemanager.model.ImageVo;
import com.picture.picturemanager.service.ImageManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/image/base64")
public class ImageManagerController {

    @Autowired
    private ImageManagerService service;

    @PostMapping
    public ResponseEntity<ImageVo> createClient(@RequestBody ImageDto image) {
        return ResponseEntity.ok(new ImageVo(service.convertBase64(image)));
    }
}

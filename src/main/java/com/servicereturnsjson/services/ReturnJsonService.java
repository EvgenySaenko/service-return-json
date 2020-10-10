package com.servicereturnsjson.services;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service
public class ReturnJsonService {

    private final Resource fileJson = new ClassPathResource("points/pick_up_points.json");

    public byte[] getJsonFile() throws IOException {
        File file = fileJson.getFile();
        return Files.readAllBytes(file.toPath());
    }

}

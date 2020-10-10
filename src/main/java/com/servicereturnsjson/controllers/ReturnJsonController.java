package com.servicereturnsjson.controllers;

import com.servicereturnsjson.services.ReturnJsonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/documents")
@RequiredArgsConstructor
public class ReturnJsonController {

    private final ReturnJsonService returnJsonService;

    @GetMapping("/points")
    public ResponseEntity<byte[]> getJsonFile() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(returnJsonService.getJsonFile(), headers, HttpStatus.OK);
    }
}

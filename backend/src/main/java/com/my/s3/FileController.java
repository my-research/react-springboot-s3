package com.my.s3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/files", produces = "multipart/form-data")
@CrossOrigin("http://localhost:3000")
public class FileController {
    @PostMapping
    @RequestMapping(produces = "multipart/form-data")
    public ResponseEntity uploadFile(List<MultipartFile> images) throws Exception {

        for (MultipartFile image : images) {
            System.out.println("image = " + image);
        }

        return ResponseEntity.ok().build();
    }
}

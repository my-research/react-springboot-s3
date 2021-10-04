package com.my.s3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/files", produces = "application/json")
@CrossOrigin("http://localhost:3000")
public class FileController {

    private final S3Uploader s3Uploader;

    @PostMapping
    public ResponseEntity<Dto> uploadFile(List<MultipartFile> images) throws Exception {

        String resUrl = s3Uploader.upload(images.get(0), "static");

        return ResponseEntity.ok(new Dto(resUrl));
    }
}

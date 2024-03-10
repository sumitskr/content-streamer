package com.stream.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MediaUploadService {
	
	@Value("${app.upload.dir}") // Set the path where videos will be stored
	private String uploadDir;
	
	public void uploadFile(MultipartFile file) throws IOException{
		 // Ensure the upload path exists
        Path path = Path.of(uploadDir);
        Files.createDirectories(path);

        // Save the file to the upload path
        Files.copy(file.getInputStream(), path.resolve(file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
    
	}
}

package com.stream.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UploadException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> uploadError(UploadException ex){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unable to upload the video : "+ ex.getFileName());
	}
	
	@ExceptionHandler(FileNotFoundExp.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> unableToFindFile(FileNotFoundExp ex){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unable to retrive file with id : "+ ex.getFileName());
	}
	
	@ExceptionHandler(UnableToFetchFiles.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> unableToFetchFiles(){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(UnableToFetchFiles.message);
	}
}

package com.stream.controller;

import org.springframework.web.bind.annotation.RestController;

import com.stream.exception.FileNotFoundExp;
import com.stream.exception.UnableToFetchFiles;
import com.stream.exception.UploadException;
import com.stream.model.MediaFilesModel;
import com.stream.service.MediaFilesDBService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(value="/content_stream/api/v1/")
public class Controller {
	
	@Autowired
	private MediaFilesDBService mediaFilesDBService;
	
	@GetMapping("/dev")
	public String developer() {
		return "Hello From Sumit Sarkar";
	}
	
	@PostMapping("/uploadFile")
	public ResponseEntity<String> uploadFile(@RequestBody MediaFilesModel filesModel) throws UploadException{
		mediaFilesDBService.addMedia(filesModel);
		return new ResponseEntity<String>(filesModel.toString(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getFile")
	public  ResponseEntity<Optional<MediaFilesModel>> getFile(@RequestParam String id) throws FileNotFoundExp {
		Optional<MediaFilesModel> ob = null;
		if(mediaFilesDBService.findById(id).isEmpty()) {
			return new ResponseEntity<>(ob,HttpStatus.NOT_FOUND);
		}
		
		ob = mediaFilesDBService.findById(id);
		return new ResponseEntity<>(ob,HttpStatus.OK);
	}
	
	@GetMapping("/getFiles")
	public  List<MediaFilesModel> getFiles() throws UnableToFetchFiles{
		return mediaFilesDBService.getAllFiles();
	}
}

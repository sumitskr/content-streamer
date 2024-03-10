package com.stream.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stream.exception.FileNotFoundExp;
import com.stream.exception.UnableToFetchFiles;
import com.stream.exception.UploadException;
import com.stream.model.MediaFilesModel;
import com.stream.repository.MediaFilesRepository;

@Service
public class MediaFilesDBServiceImpl implements MediaFilesDBService{
	
	@Autowired
	private MediaFilesRepository filesRepository;
	@Override
	public MediaFilesModel addMedia(MediaFilesModel filesModel) throws UploadException {
		return filesRepository.save(filesModel);
	}
	@Override
	public Optional<MediaFilesModel> findById(String id) throws FileNotFoundExp{
		if(filesRepository.findById(id).isEmpty()) {
			throw new FileNotFoundExp(id);
		}
		return filesRepository.findById(id);
	}
	@Override
	public List<MediaFilesModel> getAllFiles() throws UnableToFetchFiles {
		if(filesRepository.findAll().isEmpty()) {
			throw new UnableToFetchFiles();
		}
		return filesRepository.findAll();
	}

}

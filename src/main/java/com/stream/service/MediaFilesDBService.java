package com.stream.service;

import java.util.List;
import java.util.Optional;

import com.stream.exception.FileNotFoundExp;
import com.stream.exception.UnableToFetchFiles;
import com.stream.exception.UploadException;
import com.stream.model.MediaFilesModel;

public interface MediaFilesDBService{
	public MediaFilesModel addMedia(MediaFilesModel filesModel) throws UploadException;
	public Optional<MediaFilesModel> findById(String id) throws FileNotFoundExp;
	public List<MediaFilesModel> getAllFiles() throws UnableToFetchFiles;
}
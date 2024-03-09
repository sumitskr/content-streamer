package com.stream.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stream.model.MediaFilesModel;

public interface MediaFilesRepository extends MongoRepository<MediaFilesModel, String>{

}

package com.stream.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.stream.model.MediaFilesModel;
import java.util.List;
import java.util.Optional;


public interface MediaFilesRepository extends MongoRepository<MediaFilesModel, ObjectId>{
	public Optional<MediaFilesModel> findById(String id);
}

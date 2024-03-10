package com.stream.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "media_list")
public class MediaFilesModel {
	@Id
	private ObjectId id;
	private String media_file_name;
	private String file_type;
	private String link;
	@CreatedDate
    private Date creationTimestamp;
    @LastModifiedDate
    private Date lastModifiedTimestamp;
}

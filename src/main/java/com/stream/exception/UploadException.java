package com.stream.exception;



public class UploadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String fileName;

    public UploadException(String fileName) {
        super("Favourite already exists for file: " + fileName);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    } 
}

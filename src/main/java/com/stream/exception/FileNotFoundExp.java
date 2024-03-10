package com.stream.exception;


public class FileNotFoundExp extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String fileName;

    public FileNotFoundExp(String fileName) {
        super("Unable to retrive : " + fileName);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    } 
}

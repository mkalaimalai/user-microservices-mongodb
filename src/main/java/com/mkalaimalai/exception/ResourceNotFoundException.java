package com.mkalaimalai.exception;

/**
 * Created by kalaimam on 9/5/17.
 */
public class ResourceNotFoundException extends RuntimeException {

    private String resourceId;

    public ResourceNotFoundException(String resourceId, String message) {
        super(message);
        this.resourceId = resourceId;
    }
    public ResourceNotFoundException( String message) {
        super(message);
    }
}

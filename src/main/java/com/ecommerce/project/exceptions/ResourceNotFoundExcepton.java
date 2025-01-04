package com.ecommerce.project.exceptions;

public class ResourceNotFoundExcepton extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    long fieldId;

    public ResourceNotFoundExcepton(String resourceName, String field, String fieldName) {
        super(String.format("%s not found with %s: %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundExcepton(String resourceName, String field, long fieldId) {
        super(String.format("%s not found with %s: %d", resourceName, field, fieldId));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }

    public ResourceNotFoundExcepton(String message) {
        super(message);
    }

    public ResourceNotFoundExcepton() {
    }
}


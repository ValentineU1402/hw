package com.valentinushych.example_code.app_mapping_with_exeption.exeptions;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(String message) {
        super(message);
    }
}

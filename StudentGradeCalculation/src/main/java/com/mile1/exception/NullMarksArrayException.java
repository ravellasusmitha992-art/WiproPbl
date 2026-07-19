package com.mile1.exception;

public class NullMarksArrayException extends Exception {

    public NullMarksArrayException() {
        super("Marks array is null");
    }

    public NullMarksArrayException(String message) {
        super(message);
    }
}
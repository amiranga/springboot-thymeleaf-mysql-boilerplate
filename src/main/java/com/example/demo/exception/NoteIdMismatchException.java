package com.example.demo.exception;

public class NoteIdMismatchException extends RuntimeException {

    public NoteIdMismatchException() {
        super();
    }

    public NoteIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NoteIdMismatchException(final String message) {
        super(message);
    }

    public NoteIdMismatchException(final Throwable cause) {
        super(cause);
    }
}

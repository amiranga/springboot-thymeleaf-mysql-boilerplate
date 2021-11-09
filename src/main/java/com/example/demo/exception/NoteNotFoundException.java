package com.example.demo.exception;

public class NoteNotFoundException extends RuntimeException {

    public NoteNotFoundException() {
        super();
    }

    public NoteNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NoteNotFoundException(final String message) {
        super(message);
    }

    public NoteNotFoundException(final Throwable cause) {
        super(cause);
    }
}

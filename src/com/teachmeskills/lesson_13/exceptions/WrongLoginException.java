package com.teachmeskills.lesson_13.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException() {

    }

    public WrongLoginException(String message) {
        super(message);
    }
}

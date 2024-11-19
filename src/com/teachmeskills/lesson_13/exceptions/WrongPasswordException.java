package com.teachmeskills.lesson_13.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

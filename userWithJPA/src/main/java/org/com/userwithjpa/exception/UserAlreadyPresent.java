package org.com.userwithjpa.exception;

public class UserAlreadyPresent extends RuntimeException {
    public  UserAlreadyPresent(String message) {
        super(message);
    }
}

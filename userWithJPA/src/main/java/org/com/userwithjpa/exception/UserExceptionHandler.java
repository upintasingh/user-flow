package org.com.userwithjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(UserAlreadyPresent.class)
    public ResponseEntity<String> handleUserAlreadyPresent(UserAlreadyPresent userAlreadyPresent) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userAlreadyPresent.getMessage());
    }
}

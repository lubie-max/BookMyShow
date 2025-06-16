package com.bookMyShow.bookMyShow.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<String>handleUserExists(UserAlreadyExistsException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    // fallback
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleGeneralException(Exception ex) {
//        return new ResponseEntity<>("Internal Error: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }
}

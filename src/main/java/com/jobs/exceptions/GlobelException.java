package com.jobs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobelException {

    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse handleNoRecordFoundException(NoSuchElementException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("No Record Found");
        return errorResponse;
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ResponseBody
    public ErrorResponse handleNotNullException(HttpMessageNotReadableException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("jobName is marked non-null but is null");
        return errorResponse;
    }
}


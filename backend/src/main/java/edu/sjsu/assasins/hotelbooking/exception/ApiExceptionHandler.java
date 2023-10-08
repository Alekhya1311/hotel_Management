package main.java.edu.sjsu.assasins.hotelbooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;
@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value={ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
    //create payload with exceptional details
       ApiException apiException= new ApiException(e.getMessage(),HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
    //Return Response entity
        return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
    }

}

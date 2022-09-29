package com.spring.boot.jdbc.SpringBootJDBC.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.http.HttpServletRequest;
import java.time.ZonedDateTime;

@ControllerAdvice
public class PlayerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<PlayerErrorResponse> playerNotFoundHandler(PlayerNotFoundException exception, HttpServletRequest request){

        PlayerErrorResponse errorResponse = new PlayerErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                request.getRequestURI(),
                exception.getMessage() ,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<PlayerErrorResponse> genericHandler(
            Exception exception,
            HttpServletRequest request
    ){
        PlayerErrorResponse errorResponse = new PlayerErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                request.getRequestURI(),
                exception.getMessage(),
                ZonedDateTime.now()
        );


        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }






}

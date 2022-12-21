package com.springmasterclass.Springboot.tutorial.error;

import com.springmasterclass.Springboot.tutorial.entity.ErroMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFound.class)
    public ResponseEntity<ErroMessage> departmentNotFound(DepartmentNotFound exception,
                                                          WebRequest request){
        ErroMessage message = new ErroMessage(HttpStatus.NOT_FOUND,
                exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(message);
    }
}

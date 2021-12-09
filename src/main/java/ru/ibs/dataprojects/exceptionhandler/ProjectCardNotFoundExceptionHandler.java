package ru.ibs.dataprojects.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.ibs.dataprojects.exception.NotFoundException;

@ControllerAdvice
public class ProjectCardNotFoundExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<MessageException> handleThereIsNoSuchProjectCardException() {
        return new ResponseEntity<>(
                new MessageException("There is no such project card"),
                HttpStatus.NOT_FOUND
        );
    }

    @Data
    @AllArgsConstructor
    private static class MessageException {
        private String message;
    }
}

package com.assignment.InstaIndex.exception.handler;

import com.assignment.InstaIndex.DTO.ErrorResponseDTO;
import com.assignment.InstaIndex.exception.InvalidRequestException;
import com.assignment.InstaIndex.util.Constant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Global controller for exception handling.
 * @author Karan
 */

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * This is handleAllExceptions method.
     * @param ex ex
     * @return object
     */

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex) {
        final List<String> details = new ArrayList<>();
        details.add(ex.toString());
        final ErrorResponseDTO error = new ErrorResponseDTO(Constant.SERVER_ERROR, details);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * This is handleInvalidRequestException method.
     * @param ex ex
     * @return object
     */

    @ExceptionHandler(InvalidRequestException.class)
    public final ResponseEntity<Object> handleInvalidRequestException(InvalidRequestException ex) {
        final List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        final ErrorResponseDTO error = new ErrorResponseDTO(Constant.INVALID_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}

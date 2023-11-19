
package com.app.model.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


/**
 * This is a custom exception handler for not found exception
 */
@Getter
public class AppException extends RuntimeException {
    private final String code;
    private final String message;
    private final HttpStatus httpStatus;


    public AppException(String code, String message, HttpStatus httpStatus, final Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public AppException(String code, String message, HttpStatus httpStatus) {
        super(message);
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }


}

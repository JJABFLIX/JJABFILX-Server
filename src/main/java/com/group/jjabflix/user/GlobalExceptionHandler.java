package com.group.jjabflix.user;

import com.group.jjabflix.user.exception.EmailDuplicationException;
import com.group.jjabflix.user.exception.InternalServerError;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.binding.BindingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailDuplicationException.class)
    public ResponseEntity<ErrorResponse> handleEmailDuplicationException(
        EmailDuplicationException e) {
        log.error("handleEmailDuplicationException: ", e);
        ErrorResponse response = new ErrorResponse(e.getErrorCode());
        return ResponseEntity.status(response.getStatus()).body(response);
    }

//    @ExceptionHandler(BindingException.class)
//    public ResponseEntity<ErrorResponse> handleBindingException(InternalServerError e){
//        log.error("handleBindingException: ", e);
//        ErrorResponse response = new ErrorResponse(e.getErrorCode());
//        return ResponseEntity.status(response.getStatus()).body(response);
//    }

}


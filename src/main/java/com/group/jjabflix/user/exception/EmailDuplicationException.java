package com.group.jjabflix.user.exception;

import com.group.jjabflix.user.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmailDuplicationException extends IllegalArgumentException {

    private ErrorCode errorCode;

}

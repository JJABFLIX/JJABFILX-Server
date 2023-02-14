package com.group.jjabflix.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // common
    INTERNAL_SERVER_ERROR(500, "C001", "Server Error"),

    // user
    EMAIL_DUPLICATION(400, "U001", "중복된 이메일이 존재합니다.");

    private int status;
    private final String code;
    private final String message;

}

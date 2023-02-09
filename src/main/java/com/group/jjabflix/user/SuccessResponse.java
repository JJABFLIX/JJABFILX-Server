package com.group.jjabflix.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SuccessResponse {

    private int status;
    private String message;

}

package com.group.jjabflix.user.vo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long userId;
    private String email;
    private String password;
    private String phoneNumber;
    private String name;
    private String birth;
    private String membership;
    private UserStatus status;

    private String cardNumber;
    private String cardExpirationDate;

    private LocalDateTime paidAt;
    private LocalDateTime createdAt;
    private LocalDateTime withdrawAt;

    private Role role;

}
package com.group.jjabflix.user.service;

import com.group.jjabflix.user.SuccessResponse;
import com.group.jjabflix.user.dto.UserSignUpRequestDto;
import com.group.jjabflix.user.vo.User;
import com.group.jjabflix.user.vo.UserDto;

public interface UserService {

    SuccessResponse signup(UserSignUpRequestDto requestDto) throws Exception;

    String login(UserDto userDto) throws Exception;

    User getUser(Long userId) throws Exception;
}

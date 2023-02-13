package com.group.jjabflix.user.controller;

import com.group.jjabflix.user.SuccessResponse;
import com.group.jjabflix.user.dto.UserSignUpRequestDto;
import com.group.jjabflix.user.service.UserService;
import com.group.jjabflix.user.vo.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/auth/login")
    public String login(@RequestBody UserDto userDto) throws Exception {
        return userService.login(userDto);
    }

    @PostMapping("/auth/signup")
    public SuccessResponse signup(@RequestBody UserSignUpRequestDto requestDto) throws Exception {
        return userService.signup(requestDto);
    }

    @PostMapping("/auth/logout")
    public void logout() {

    }

    @GetMapping("/auth/password")
    public void findPassword() {

    }

    @GetMapping("/users/{userId}")
    public void getUser(@PathVariable Long userId) {

    }

    @PutMapping("/users/{userId}")
    public void editUser(@PathVariable Long userId) {

    }

    @DeleteMapping("/users/{userId}")
    public void withdrawUser(@PathVariable Long userId) {

    }
}

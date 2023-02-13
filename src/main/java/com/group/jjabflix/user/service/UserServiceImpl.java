package com.group.jjabflix.user.service;

import com.group.jjabflix.config.JwtTokenProvider;
import com.group.jjabflix.user.ResponseMessage;
import com.group.jjabflix.user.SuccessResponse;
import com.group.jjabflix.user.dao.UserMapper;
import com.group.jjabflix.user.dto.UserSignUpRequestDto;
import com.group.jjabflix.user.vo.User;
import com.group.jjabflix.user.vo.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private final PasswordEncoder passwordEncoder;


    @Transactional
    @Override
    public SuccessResponse signup(UserSignUpRequestDto requestDto) throws Exception {
        if (userMapper.selectUserByEmail(requestDto.getEmail()) != null) {
            throw new Exception("이미 존재하는 이메일입니다");
        }

        User user = requestDto.toUser();
        user.encodePassword(passwordEncoder);

        userMapper.insertUser(user);

        return new SuccessResponse(HttpStatus.OK.value(), ResponseMessage.SIGNUP_SUCCESS);
    }

    @Override
    public String login(UserDto userDto) throws Exception {
//        User user = userMapper.selectUserByEmail(userDto.getEmail());
//
//        if (user == null) {
//            throw new Exception();
//        }
//
//        String password = userDto.getPassword();
//        if (!user.getPassword().equals(password)) {
//            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
//        }
//
//        List<String> roles = new ArrayList<>();
//        roles.add(user.getRole().name());
//
//        return jwtTokenProvider.createToken(user.getEmail(), roles);
        // 응답 response 객체도만들고
        // exception handller 만들고

    }

    @Override
    public User getUser(Long userId) throws Exception {
        User user = userMapper.selectUserDetail(userId);

        if (user == null) {
            throw new Exception();
        }

        return user;
    }
}

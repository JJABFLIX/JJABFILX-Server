package com.group.jjabflix.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtill {

    public static String getLoginUsername() {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
            .getPrincipal();

        return user.getUsername();
    }
}

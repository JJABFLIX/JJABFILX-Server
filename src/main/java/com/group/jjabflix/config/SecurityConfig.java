package com.group.jjabflix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin().disable()
            .httpBasic().disable()
            .cors().disable()
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
            .antMatchers("/api/v1/auth/**").permitAll()
            .antMatchers("/api/v1/users/**").hasRole("USER")
            .anyRequest().authenticated();
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(AUTH_WHITELIST);
    }

    private static final String[] AUTH_WHITELIST = {
        "/v2/api-docs",
        "/v3/api-docs/**",
        "/configuration/ui",
        "/resources/**",
        "/swagger-resources/**",
        "/configuration/security",
        "/swagger-ui.html",
        "/webjars/**",
        "/file/**",
        "/image/**",
        "/swagger/**",
        "/swagger-ui/**",
        "/h2/**"
    };

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}

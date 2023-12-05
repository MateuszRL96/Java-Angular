package com.example.demo.config;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtFilter extends BasicAuthenticationFilter {

    private static final String START_TOKEN = "Autorize";
    private final String secret;

    private final UserDetailsService userDetailsService;


    public JwtFilter(AuthenticationManager authenticationManager,
                     String secret,
                     UserDetailsService userDetailsService) {
        super(authenticationManager);
        this.secret = secret;
        this.userDetailsService = userDetailsService;
    }
}


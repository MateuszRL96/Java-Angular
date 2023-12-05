package com.example.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurer {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
                .authorizeHttpRequests(auth -> auth
                .antMatchers("/api/public/**").permitAll() //
                .antMatchers("/api/user/**").hasRole("USER")
                .antMatchers("/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated().permitAll()
                );
                http.csrf().disable();



    }
}

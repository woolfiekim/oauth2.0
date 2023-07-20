package io.security.oauth2.springsecurityoauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain1(HttpSecurity http) throws Exception{
        http.authorizeRequests().anyRequest().authenticated();
        http.formLogin();
        // http.apply(new CustomSecurityConfigurer().setFlag(false));
        return http.build();
    }

    @Bean
    SecurityFilterChain securityFilterChain2(HttpSecurity http) throws Exception{
        http.authorizeRequests().anyRequest().authenticated();
        // http.formLogin();
        http.httpBasic();
        return http.build();
    }
}

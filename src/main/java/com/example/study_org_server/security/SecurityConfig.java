package com.example.study_org_server.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf->csrf.disable())
            // Jwtを使用する場合は、リクエストごとにセッションを確立する必要はない。
            .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            // "/api/auth/**"は認証時に使用するエンドポイントのため許可、
            // その他のエンドポイントへのリクエストは認証が必要とした。
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll() );

            // jwtAuthenticationFilterを先に配置することで、リクエストごとにJWTを解析して認証を済ませることができる。
            //.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
}
}

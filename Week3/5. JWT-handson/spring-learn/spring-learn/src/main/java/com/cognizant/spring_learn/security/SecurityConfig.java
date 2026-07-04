package com.cognizant.spring_learn.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {

        return new InMemoryUserDetailsManager(
                User.withUsername("user")
                        .password(passwordEncoder().encode("pwd"))
                        .roles("USER")
                        .build(),

                User.withUsername("admin")
                        .password(passwordEncoder().encode("pwd"))
                        .roles("ADMIN")
                        .build()
        );
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

@Bean
public SecurityFilterChain filterChain(HttpSecurity http)
        throws Exception {

    http
            .csrf(csrf -> csrf.disable())

            .httpBasic(Customizer.withDefaults())

            .authorizeHttpRequests(auth -> auth

                    .requestMatchers("/authenticate")
                    .hasAnyRole("USER", "ADMIN")

                    .anyRequest()
                    .authenticated())

            .addFilterBefore(
                    new JwtAuthorizationFilter(),
                    BasicAuthenticationFilter.class);

    return http.build();
}
}
package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import java.nio.charset.StandardCharsets;
import javax.crypto.SecretKey;
import io.jsonwebtoken.security.Keys;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        return map;
    }

    private String getUser(String authHeader) {

        String encoded = authHeader.substring(6);

        byte[] decoded = Base64.getDecoder().decode(encoded);

        String credentials = new String(decoded);

        return credentials.substring(0, credentials.indexOf(":"));
    }


private String generateJwt(String user) {

    SecretKey key = Keys.hmacShaKeyFor(
            "ThisIsASecretKeyForJwtAuthentication12345"
                    .getBytes(StandardCharsets.UTF_8));

    return Jwts.builder()
            .subject(user)
            .issuedAt(new Date())
            .expiration(new Date(System.currentTimeMillis() + 1200000))
            .signWith(key)
            .compact();
}
}
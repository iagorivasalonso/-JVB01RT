package com.hackaboss.app.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;


@Service
public class JwtService  implements IJwtService{

    private static final String SECRET_KEY = "MiSuperClaveSecretaYSuperSeguraT123";

    @Override
    public Key getKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    @Override
    public String extractUsername(String token) {
        return "";
    }

    @Override
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        return null;
    }

    @Override
    public Claims extractAllClaims(String token) {
        return null;
    }

    @Override
    public Date extractExpiration(String token) {
        return null;
    }

    @Override
    public String generateToken(String username, String data) {
        return Jwts
                .builder()
                .setClaims(Map.of("data",data))
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }
}

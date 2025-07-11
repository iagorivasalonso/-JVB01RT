package com.hackaboss.app.service;
import io.jsonwebtoken.Claims;
import java.security.Key;
import java.util.Date;
import java.util.function.Function;

public interface IJwtService {
    Key getKey();

    String extractUsername(String token);

    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);

    Claims extractAllClaims(String token);

    Date extractExpiration(String token);

    String generateToken(String username, String data);
}

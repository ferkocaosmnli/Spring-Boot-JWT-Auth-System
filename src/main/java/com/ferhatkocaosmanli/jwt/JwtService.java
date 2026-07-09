package com.ferhatkocaosmanli.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Component
public class JwtService {

    public static final String SECRET_KEY = "5N+6yAw9UJlZGIE3ivXxkQlxnb9BauSkvcdSJ447DQE=";

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claimsMap   =  new HashMap<>();
        claimsMap.put("role", "ADMIN");
//
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .addClaims(claimsMap)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000*60*60*2))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }


    public  Object getClaimsByKey(String token , String key) {
        Claims claims =  getClaims(token);
        return claims.get(key);
    }


    public Claims getClaims(String token) {
        return Jwts
                .parser() // parserBuilder yerine parser kullanın
                .verifyWith(getKey()) // setSigningKey yerine verifyWith kullanın
                .build()
                .parseSignedClaims(token) // parseClaimsJws yerine parseSignedClaims kullanın
                .getPayload(); // getBody() yerine getPayload() kullanın
    }

    public <T> T exportToken(String token , Function<Claims, T> claimsFunction) {
        Claims claims =  getClaims(token);
        return claimsFunction.apply(claims);
    }

    public String getUsernameByToken(String token) {
        return exportToken(token, Claims::getSubject);
    }


    public boolean isTokenExpired(String token) {
        Date expiredDate= exportToken(token, Claims::getExpiration);
        return new Date().before(expiredDate);
    }

    public SecretKey getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}

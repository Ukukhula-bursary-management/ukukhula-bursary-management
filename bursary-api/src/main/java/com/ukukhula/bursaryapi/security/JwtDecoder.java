package com.ukukhula.bursaryapi.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JwtDecoder {

  public DecodedJWT decode(String token){
      return JWT.require(Algorithm.HMAC256(SecurityConstants.SECRET_KEY))
              .build()
              .verify(token);
  }

}

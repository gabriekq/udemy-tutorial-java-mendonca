package com.mendonca.photoapp.api.users.security;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mendonca.photoapp.api.users.service.UsersService;
import com.mendonca.photoapp.api.users.shared.UserDto;
import com.mendonca.photoapp.api.users.ui.model.LoginRequestModel;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

	
	private UsersService usersService;
	private Environment environment;
	
		public AuthenticationFilter(AuthenticationManager authenticationManager,UsersService usersService,Environment environment) {
		     super(authenticationManager);
		     this.environment=environment;
		     this.usersService=usersService;
	    }
	
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		
		try {
			
			LoginRequestModel creds = new ObjectMapper().readValue(request.getInputStream(), LoginRequestModel.class);
			
			return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(creds.getEmail(),creds.getPassword(),new ArrayList<>()  ));

		}catch (IOException ioexception) {
			throw new RuntimeException(ioexception);
		}
		
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
		Authentication auth) throws IOException, ServletException {
	
		String userName =((User)auth.getPrincipal()).getUsername();
		UserDto userDetails =  usersService.getUserDetailsByEmail(userName);
		String tokenSecret = environment.getProperty("token.secret");
		byte[] secretKeyBytes = Base64.getEncoder().encode(tokenSecret.getBytes());
		SecretKey secretKey =Keys.hmacShaKeyFor(secretKeyBytes);
		
		
		Instant now = Instant.now();
	  //  String token=Jwts.builder()
	//	.setSubject(userDetails.getUserId())
	//	.setExpiration( Date.from(now.plusMillis(Long.parseLong(environment.getProperty("token.expiration_time")))))
	//	.setIssuedAt(Date.from(now))
	//	.signWith(secretKey,SignatureAlgorithm.ES512).compact();
		
		String token = Jwts.builder()
                .subject(userDetails.getUserId())
                .expiration(Date.from(now.plusMillis(Long.parseLong(environment.getProperty("token.expiration_time")))))
                .issuedAt(Date.from(now))
                .signWith(secretKey)   
                .compact();
		
		
	    response.addHeader("token", token);
	    response.addHeader("userId", userDetails.getUserId());
	}


}

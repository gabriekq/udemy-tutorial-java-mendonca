package com.mendonca.photoapp.api.users.security;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.IpAddressMatcher;

import com.mendonca.photoapp.api.users.service.UsersService;

@Configuration
@EnableWebSecurity
public class WebSecurity {

	private Environment environment;
	
	private UsersService usersService;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	public WebSecurity(Environment environment,BCryptPasswordEncoder bCryptPasswordEncoder,UsersService usersService ) {
		this.environment = environment;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
		this.usersService = usersService;
	}

	@Bean
	protected SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {

		//Configure AuthenticationManagerBuilder
		AuthenticationManagerBuilder authenticationManagerBuilder =	httpSecurity.getSharedObject(AuthenticationManagerBuilder.class);
		
		authenticationManagerBuilder.userDetailsService(usersService)
		.passwordEncoder(bCryptPasswordEncoder);
		
		AuthenticationManager authenticationManager = authenticationManagerBuilder.build();
		
		AuthenticationFilter authenticationFilter = new AuthenticationFilter(authenticationManager, usersService,environment);
		authenticationFilter.setFilterProcessesUrl(environment.getProperty("login.url.path"));
		
		IpAddressMatcher hasIpAddress = new IpAddressMatcher(Objects.requireNonNull(environment.getProperty("gateway.ip")));
		IpAddressMatcher hasIpv4Address = new IpAddressMatcher(Objects.requireNonNull(environment.getProperty("gateway.ipv4")));

		httpSecurity.csrf((csrf) -> csrf.disable());
		//httpSecurity.authorizeRequests().requestMatchers(new AntPathRequestMatcher("/actuator/**",HttpMethod.GET.name())).permitAll();

		httpSecurity.authorizeHttpRequests((authorizeHttpRequests) -> {
			
			
			authorizeHttpRequests.requestMatchers("/users/**").access((access, context) -> {

				if (hasIpAddress.matches(context.getRequest())) {
					return new AuthorizationDecision(hasIpAddress.matches(context.getRequest()));
				}

				return new AuthorizationDecision(hasIpv4Address.matches(context.getRequest()));

			});
			authorizeHttpRequests.requestMatchers(new AntPathRequestMatcher("/h2-console/**"), new AntPathRequestMatcher("/actuator/**"))
			.permitAll()
			.and()
			.addFilter(authenticationFilter)
			.authenticationManager(authenticationManager);
			
		}).sessionManagement(
				(sessionManagement) -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		httpSecurity.headers((headers) -> headers.frameOptions(option ->  option.disable() ));

		return httpSecurity.build();
	}

}

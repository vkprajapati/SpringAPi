package com.gyftx.Gyftx_Rest.Security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.gyftx.Gyftx_Rest.Service.UserService;

//This class define one method like SignUp method that users can use to create new account.
//this method will be public.
//all other web service entry point will be protected and require authorization and authentication except this class.

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{
	
	private final UserService userDetailsService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public WebSecurity(UserService userDetailsService, BCryptPasswordEncoder bCryptPasswordEncoder)
	{
		
		this.userDetailsService = userDetailsService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL)
		.permitAll().anyRequest().authenticated().and()
		.addFilter(getAuthenticationFilter());
		
	}
	
	
	public void cofigure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
	}

	public AuthenticationFilter getAuthenticationFilter() throws Exception{
		
		final AuthenticationFilter filter = new AuthenticationFilter(authenticationManager());
		filter.setFilterProcessesUrl("/gyftx/login");
		return filter;
	}
}

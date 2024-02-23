package com.hari.telecome.filter;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import com.hari.telecome.service.JwtService;
import com.hari.telecome.service.UserDetailsImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtAuthenticationFilter extends OncePerRequestFilter{
	
	private final JwtService jwtService;
	private final UserDetailsImpl userDetails;
	

	

	public JwtAuthenticationFilter(JwtService jwtService, UserDetailsImpl userDetails) {
		super();
		this.jwtService = jwtService;
		this.userDetails = userDetails;
	}




	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String authHeader = request.getHeader("Authorization");
		
		if(authHeader == null || !authHeader.startsWith("Bearer ")){
			filterChain.doFilter(request, response);
			return;
		}
		String token = authHeader.substring(7);
		String userName = jwtService.extractUsername(token);
//		if(userName !=null && SecurityContextHolder.getContext().getAuthentication()==null) {
//			UsernamePasswordAuthenticationToken(
//					userDetails,null,userDetails..getAuth 
//					)
//			
//		}
		
	}

}

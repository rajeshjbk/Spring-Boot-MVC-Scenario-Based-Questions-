package com.raj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		 HttpSession session = request.getSession(false);

	        // check login session
	        if (session != null && session.getAttribute("user") != null) {
	            return true; // allow request
	        }

	        // redirect if not logged in
	        response.sendRedirect(request.getContextPath() + "/login");
	   
	        return false;
	}
}

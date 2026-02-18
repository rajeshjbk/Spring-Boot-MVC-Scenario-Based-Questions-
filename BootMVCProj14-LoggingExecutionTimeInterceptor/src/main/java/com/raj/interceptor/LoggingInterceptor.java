package com.raj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoggingInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "startTime";

    // BEFORE controller execution
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        long startTime = System.currentTimeMillis();

        // store start time in request
        request.setAttribute(START_TIME, startTime);

        // print request URL
        System.out.println("REQUEST URL :: " + request.getRequestURL());

        return true;
    }

    // AFTER controller but BEFORE view rendering
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {

        System.out.println("Handler executed successfully...");
    }

    // AFTER complete request (View rendered)
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {

        long startTime = (Long) request.getAttribute(START_TIME);

        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Execution Time :: " + executionTime + " ms");
        System.out.println("Response Status :: " + response.getStatus());
        System.out.println("---------------------------------------");
    }
}

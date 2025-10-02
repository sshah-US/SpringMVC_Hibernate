package com.ss.breg.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.ss.breg.model.AllInfo;
//This Interceptor checks all values set in session before moving to next page
public class StepFlowInterceptor implements HandlerInterceptor {

	 @Override
	    public boolean preHandle(HttpServletRequest request,
	                             HttpServletResponse response,
	                             Object handler) throws Exception {

	        HttpSession session = request.getSession(false); 
	        String uri = request.getRequestURI();

	        AllInfo allInfo = (session != null) ? (AllInfo) session.getAttribute("allInfo") : null;

	        // If going to ContactInfo, PersonalInfo must be filled
	        if (uri.contains("contactInfo")) {
	            if (allInfo == null || allInfo.getFname() == null || allInfo.getMname() == null || allInfo.getLname() == null || allInfo.getGender() == null) {
	                response.sendRedirect("PersonalInfo.jsp?error=Please+complete+Personal+Info+first");
	                return false;
	            }
	        }

	        // If going to BankInfo, ContactInfo must be filled
	        if (uri.contains("bankInfo")) {
	            if (allInfo == null || allInfo.getAddress() == null || allInfo.getCity() == null || allInfo.getState() == null || allInfo.getCountry() == null || allInfo.getPhno() == null) {
	                response.sendRedirect("ContactInfo.jsp?error=Please+complete+Contact+Info+first");
	                return false;
	            }
	        }

	        // If going to Success, BankInfo must be filled
	        if (uri.contains("success")) {
	            if (allInfo == null || allInfo.getBname() == null || allInfo.getAcnum() == null || allInfo.getSsn() == null) {
	                response.sendRedirect("BankInfo.jsp?error=Please+complete+Bank+Info+first");
	                return false;
	            }
	        }

	        return true; // allow request
	    }
}


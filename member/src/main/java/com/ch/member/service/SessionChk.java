package com.ch.member.service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
// login하지 않은 사람이 사용하지 못하도록(주소창에서 바로 main.do로 접근하는 것을 방지)
public class SessionChk implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session == null || session.getAttribute("id") == null) {
			response.sendRedirect("loginForm.do");
			return false;
		}
		return true;
	}
}

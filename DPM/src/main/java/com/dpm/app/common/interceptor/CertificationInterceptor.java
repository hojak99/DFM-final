package com.dpm.app.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dpm.app.common.dto.Token;

@Configuration
public class CertificationInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HttpSession session = request.getSession();
		Token token = (Token) session.getAttribute("token");
		
		try{
			if(!ObjectUtils.isEmpty(token)){
				System.out.println("세션있음: " + token.getTokenKey());
				return true;
			} else {
				System.out.println("세션없음");
				return true;
			}
		}catch (Exception e) {
			System.out.println("세션 Exception");
			return false;
		}
	}
	
}

package com.dpm.app.facebook;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facebook")
public class FacebookController {
	private static final String FACEBOOK_CLIENT_ID = "168834073744665";
	private static final String REDIRECT_URL = "http://localhost:8080/app";
	
	@RequestMapping(value ="/login")
	public String getFacebookSigninCode(HttpSession session) {
		String facebookUrl = "https://www.facebook.com/v2.12/dialog/oauth?"
							+ "client_id="+FACEBOOK_CLIENT_ID
							+ "&redirect_uri="+REDIRECT_URL;
		
		return "redirect:"+facebookUrl;
	}
}

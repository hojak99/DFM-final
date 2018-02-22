package com.dpm.app.facebook;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facebook")
public class FacebookController {
	private static final String FACEBOOK_CLIENT_ID = "168834073744665";
	private static final String REDIRECT_URL = "http://localhost:8080/app/facebook/facebookAccessToken";
	private static final String FACEBOOK_CLIENT_SECRET_KEY = "9d12b9b1ef3f991e92edaba14c457f87";

	@RequestMapping(value = "/login")
	public String getFacebookSigninCode(HttpSession session) {
		String facebookUrl = "https://www.facebook.com/v2.12/dialog/oauth?" + "client_id=" + FACEBOOK_CLIENT_ID
				+ "&redirect_uri="+REDIRECT_URL;

		return "redirect:" + facebookUrl;
	}

	@RequestMapping(value = "/facebookAccessToken")
	public void getFacebookSignin(String code, HttpSession session, String state) throws Exception {
		System.out.println("code : " + code);
		System.out.println("session : " + session);
		System.out.println("state : " + state);

		String accessToken = requestFacebookAccessToken(session, code);
		System.out.println(accessToken);
	}

	private String requestFacebookAccessToken(HttpSession session, String code) throws Exception {
		String facebookUrl = "https://graph.facebook.com/v2.12/oauth/access_token?"+
								"client_id="+FACEBOOK_CLIENT_ID +
								"&redirect_uri="+REDIRECT_URL+
								"&client_secret="+FACEBOOK_CLIENT_SECRET_KEY+
								"&code="+code;
		
		JSONObject jsonObject = getJsonObject(facebookUrl);
		String facebookAcccessToken = (String) jsonObject.get("access_token");
		return facebookAcccessToken;
	}

	private JSONObject getJsonObject(String url) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpGet httpGet = new HttpGet(url);
			System.out.println("Executing request " + httpGet.getRequestLine() );
			
			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				@Override
				public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if(status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					} else {
						throw new ClientProtocolException("Unexpected response status : " + status);
					}
				}
			};
			String responseBody = httpClient.execute(httpGet, responseHandler);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(responseBody);
			return jsonObject; 
		} finally {
			httpClient.close();
		}
	}
}

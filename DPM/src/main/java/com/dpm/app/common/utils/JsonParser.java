package com.dpm.app.common.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
	private static JSONParser jsonParser = new JSONParser();
	
	public static JSONObject parseJsonObject(String param) throws ParseException {
		return (JSONObject) JsonParser.jsonParser.parse(param);
	}
}

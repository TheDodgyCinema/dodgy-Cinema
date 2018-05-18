package com.qa.dodgy.util;

public interface IJSONUtil {
	
	public String getJSONForObject(Object obj);
	
	public <T> T getObjectForJSON(String jsonString, Class<T> clazz);
	
}

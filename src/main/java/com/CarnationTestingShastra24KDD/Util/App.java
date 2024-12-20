package com.CarnationTestingShastra24KDD.Util;

public class App {

	private static String baseDir = System.getProperty("user.dir");
//	System.out.println(baseDir);
	private static String filePath = baseDir+"\\src\\test\\resources\\propertiesFIles\\app.properties";
//	System.out.println(filePath);
	
	
	public static String getAppUrl(String env) {
		
		return PropertiesUtil.getLocator(filePath, env+".url");
	}
	
	
	public static String getUserName(String env) {

		return PropertiesUtil.getLocator(filePath, env+".username");

	}
	
	
	public static String getPassword(String env) {

		return PropertiesUtil.getLocator(filePath, env+".password");

	}
	
}

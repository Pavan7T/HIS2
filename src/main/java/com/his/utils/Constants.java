package com.his.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Constants {

	public static final String username;
	public static final String password;
	public static final String url;
	public static final String browser;

	static {
		Properties Prop = new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/his/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		username = Prop.getProperty("username");
		password = Prop.getProperty("password");
		url = Prop.getProperty("url");
		browser = Prop.getProperty("browser");
	}

	// System.out.println(username);

}

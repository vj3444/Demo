package com.demo.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver driver;
	static Properties prop;
	
	
	public static void initialization() throws IOException {
		
		
		
		prop = new Properties();
		
		FileReader file = new FileReader(System.getProperty("user.dir")+"\\com\\demo\\properties\\config.properties");
		
		prop.load(file);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		
		
		
	}

}

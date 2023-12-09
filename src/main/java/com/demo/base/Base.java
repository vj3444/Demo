package com.demo.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

public class Base {

//	static WebDriver driver;
//	
//	
//	static Properties prop;
//	static JavascriptExecutor js;
//
//	public static void initialization() throws IOException {
//
//		prop = new Properties();
//
//		FileReader file = new FileReader(System.getProperty("user.dir") + "\\com\\demo\\properties\\config.properties");
//
//		prop.load(file);
//
//		String browser = prop.getProperty("browser");
//
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//			
//			
//			 js= (JavascriptExecutor)driver;
//			 js.executeScript("document.getElementById('s').value='Vivek';");
//
//			ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(newTab.get(3));
//			
//			TouchAction actions = new TouchAction(driver1);
//			
//			WebElement element=driver1.findElement(By.xpath("kmk"));
//			
//			actions.tap(element);
//			
//			
//		}
	
}

package com.demo.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTesting {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		cap.setCapability(MobileCapabilityType.UDID, 12345);
		cap.setCapability(MobileCapabilityType.APP, "path.apk");
		
		URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");
		
		AppiumDriver<MobileElement> driver = new AndroidDriver<>(appiumServer,cap);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())"));
		
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().resourceId(\"com.android.vending:id/tab_recycler_view\")).getChildByText("
		        + "new UiSelector().className(\"android.widget.TextView\"), \"Games We Are Playing\")"));
		
		MobileElement ele = driver.findElement(By.id("abcd"));
		
		TouchAction act1 = new TouchAction(driver);
		TouchAction act2 = new TouchAction(driver);
		
		MultiTouchAction mt = new MultiTouchAction(driver);
		
		act1.longPress(1, 1).moveTo(0, 0);
		act2.longPress(0, 0).moveTo(1,1);
		
		mt.add(act2);
		
		ele.click();
		
		Dimension windowSize = driver.manage().window().getSize();
		
		int screenWidth = windowSize.getWidth();
        int screenHeight = windowSize.getHeight();
        
        int startX = screenWidth/2;
        int endX = screenWidth/2;
        
        int starty = screenHeight*8/9;
        int	endy = screenHeight/9;
        
        driver.swipe(startX, starty, endX, endy, endy);
		
		TouchAction action = new TouchAction(driver);
		action.tap(ele).perform();
		
		action.longPress(ele).perform();
	}
}

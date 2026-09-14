package appiumConcepts;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Scroll extends AppiumBaseClass  {
		
	
	@Test
	public void ScrollDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException
	{   
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		//use below method where you exactly know where to scroll or where to scroll is known prior
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(UiSelector().scrollIntoView(text(\"WebView\"));"));
		//use below method when you do not know where to scroll or no prior idea
		/*boolean canScrollMore;
		do {
	        canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		   // "percent", 1.0
		    "percent", 3.0
		));
		}while(canScrollMore);//this whole do while is for scrolling until end*/
		
		scrollToEndAction();	
		
	Thread.sleep(2000);
	
	}

}

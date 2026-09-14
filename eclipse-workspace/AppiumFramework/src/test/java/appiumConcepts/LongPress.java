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

public class LongPress extends AppiumBaseClass  {
		
	
	@Test
	public void LongPressGesture() throws MalformedURLException, URISyntaxException

	{   
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Customer Adapter")).click();
	WebElement ele=	driver.findElement(By.xpath("////android.widget.TextView[@text='People Names']"));
	longPressAction(ele);
	//((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", //long click gesture
	//		ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000));//long click gesture
	 String menutext=  driver.findElement(By.id("android:id/title")).getText();
	 Assert.assertEquals(menutext, "Sample menu");
	 Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	}

}

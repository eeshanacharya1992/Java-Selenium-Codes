package appiumConcepts;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBaseClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
public void AppiumConfiguration() throws MalformedURLException, URISyntaxException
{
	 service= new AppiumServiceBuilder().withAppiumJS(new File("C://Users//eesha//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4723).build(); 
	//above code to start server
	service.start();//this code from line 28 to 30 to start appium server
	UiAutomator2Options options= new UiAutomator2Options();
	options.setDeviceName("Medium Phone API 36.1");//Emulator 
	
	options.setApp("C://Users//eesha//eclipse-workspace//AppiumFramework//src//test//java//resources//ApiDemos-debug.apk");
//AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
 driver= new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", //long click gesture
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000));//long click gesture
	}
	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do {
	        canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		   // "percent", 1.0
		    "percent", 3.0
		));
		}while(canScrollMore);//this whole do while is for scrolling until end
	}
	public void swipeAction(WebElement ele, String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "element id",((RemoteWebElement)ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	@AfterClass
public void tearDown()
{
	driver.quit();
	service.stop();	 //stop server
}
}

package appiumConcepts;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
public class Miscellanous extends AppiumBaseClass  {	
	@Test
	public void Miscellanousconcepts() throws MalformedURLException, URISyntaxException, InterruptedException
	{   	 
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	DeviceRotation landscape= new DeviceRotation(0,0,90);
	driver.rotate(landscape);
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	String alertTitle= driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(alertTitle, "WiFi settings");
	// copypaste
	//copy to clipboard- paste it clipboard
	driver.setClipboardText("Eeshan"); //copy to clipboard
	driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());//to retrieve text or paste it clipboard
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	//driver.findElement(By.id("android:id/edit")).sendKeys("Eeshan");
	//driver.findElement(By.id("android:id/button1")).click();
	//driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	//driver.pressKey(new KeyEvent(AndroidKey.HOME));
	driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
	}

}

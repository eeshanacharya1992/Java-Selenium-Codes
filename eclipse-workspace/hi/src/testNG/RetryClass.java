package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryClass {
    @Test(retryAnalyzer=testNG.RetryMechanism.class)
    void retry()
    {
    //	System.setProperty("webdriver.chrome.driver", "D:\\Mohan-Study\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    /*	driver.get("https://www.google.com");
    	driver.findElement(By.name("qa")).sendKeys("India"+Keys.ENTER);*/
    	driver.get("https://www.amazon.in/");
    	driver.findElement(By.cssSelector("#captchacharacters")).sendKeys("shoes"+Keys.ENTER);
    }
}
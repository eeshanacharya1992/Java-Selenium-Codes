package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryClass {
    @Test(retryAnalyzer=testNG.RetryMechanism.class)
    void retry()
    {
    	ChromeDriver driver= new ChromeDriver();
    /*	driver.get("https://www.google.com");
    	driver.findElement(By.name("qa")).sendKeys("India"+Keys.ENTER);*/
    	driver.get("https://www.amazon.in/");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes"+Keys.ENTER);
    }
}

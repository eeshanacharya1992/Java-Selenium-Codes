package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssert2 {
	 WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        // Set path to chromedriver if required
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testPageTitle() {
	        driver.get("https://www.example.com");

	        String actualTitle = driver.getTitle();
	        String expectedTitle = "Wrong Title";

	        // Hard assertion: test will stop here if this fails
	        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

	        System.out.println("This line will only be printed if the assertion passes.");
}
}
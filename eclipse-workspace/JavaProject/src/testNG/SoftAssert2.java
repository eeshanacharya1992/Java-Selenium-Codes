package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testPageTitleAndUrl() {
        driver.get("https://www.example.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wrong Title";  // Intentionally wrong
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.example.com/";

        // Create a SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        // Soft assertions
        softAssert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
        softAssert.assertEquals(actualUrl, expectedUrl, "URL does not match!");

        System.out.println("This line will be printed even if assertions fail.");

        // Important: Call assertAll() to report all failures
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
       // driver.quit();
    }
}

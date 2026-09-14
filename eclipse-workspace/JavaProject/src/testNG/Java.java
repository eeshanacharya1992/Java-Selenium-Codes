package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
              driver.get("https://the-internet.herokuapp.com/");
	        try {
	            // Pass credentials via URL for basic auth
	            String username = "admin";
	            String password = "admin";
	            String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

	            // Open the authenticated URL
	            driver.get(url);
              //  Thread.sleep(4000);
	            // Validate authentication success
	            String pageSource = driver.getPageSource();
	            if (pageSource.contains("Congratulations! You must have the proper credentials.")) {
	                System.out.println("Test Passed: Basic Auth successful!");
	            } else {
	                System.out.println("Test Failed: Authentication failed.");
	            }

	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        } finally {
	            // Close the browser
	            Thread.sleep(2000);
	           // driver.quit();
	        }

	}

}

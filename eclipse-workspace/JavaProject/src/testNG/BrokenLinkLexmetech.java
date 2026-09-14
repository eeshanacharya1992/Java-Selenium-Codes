package testNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkLexmetech {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Open the website to check
	        driver.get("https://lexmetech.com/");

	        // Get all <a> elements
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total links found: " + links.size());

	        int brokenLinksCount = 0;

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");

	            // Skip if href is null or empty
	            if (url == null || url.isEmpty()) {
	                System.out.println("Skipped (empty or null href): " + link.getText());
	                continue;
	            }

	            try {
	                // Create a connection
	                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();

	                int responseCode = connection.getResponseCode();

	                // If response code >= 400, it's a broken link
	                if (responseCode >= 400) {
	                    System.out.println("❌ Broken link: " + url + " | Status code: " + responseCode);
	                    brokenLinksCount++;
	                } else {
	                    System.out.println("✅ Valid link: " + url + " | Status code: " + responseCode);
	                }

	            } catch (IOException e) {
	                // Catch connection errors
	                System.out.println("⚠️ Exception while checking link: " + url);
	                System.out.println("Error: " + e.getMessage());
	                brokenLinksCount++;
	            }
	        }

	        System.out.println("\nTotal broken links: " + brokenLinksCount);

	      //  driver.quit();
	}

}

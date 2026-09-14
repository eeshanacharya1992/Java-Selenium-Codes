package Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonIphone {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to Amazon
            driver.get("https://www.amazon.in");

            // Search for iPhones
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iPhone");
            searchBox.submit();

            // Wait for the results to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-main-slot")));

            // Select a few iPhones (for demonstration, we will select the first three)
            List<WebElement> items = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
            double totalPrice = 0.0;
            int selectedCount = 0;

            for (int i = 0; i < Math.min(3, items.size()); i++) {
                WebElement item = items.get(i);
                WebElement priceElement = item.findElement(By.cssSelector(".a-price .a-offscreen"));

                if (priceElement != null) {
                    String priceText = priceElement.getText().replace("$", "").replace(",", "");
                    double price = Double.parseDouble(priceText);

                    // Optionally, print item title and price
                    String title = item.findElement(By.cssSelector("h2 a")).getText();
                    System.out.println("Selected: " + title + " - Price: $" + price);

                    totalPrice += price;
                    selectedCount++;
                }
            }

            // Display the summary
            System.out.println("Number of selected iPhones: " + selectedCount);
            System.out.println("Total price: $" + totalPrice);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
         //   driver.quit();
	}

	}}

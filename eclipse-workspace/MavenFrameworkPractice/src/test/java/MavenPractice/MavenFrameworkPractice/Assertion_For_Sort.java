package MavenPractice.MavenFrameworkPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_For_Sort {
    @Test
    public void sort() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.cssSelector("[id=s-result-sort-select]"));
		Select s1 = new Select(dd);
		s1.selectByIndex(1);
		driver.navigate().refresh();
		Thread.sleep(2000);
		List<WebElement> priceElements = driver.findElements(By.cssSelector("span.a-price-whole"));
		List<Integer> actualPrices = new ArrayList<>();
          
		for (int i = 5; i < priceElements.size(); i++) {
			String text = priceElements.get(i).getText().replace(",", "").trim();
			if (!text.isEmpty()) {

				try {
					actualPrices.add(Integer.parseInt(text));
				} catch (NumberFormatException e) {
					System.out.println("Skipped non-numeric price: " + text);
				}
			}

		}

		System.out.println("Actual Prices: " + actualPrices);

		// Create a copy and sort it to compare
		List<Integer> expectedPrices = new ArrayList<>(actualPrices);
		Collections.sort(expectedPrices);
		System.out.println(expectedPrices);

		// Assertion
		//Assert.assertNotEquals(actualPrices, expectedPrices);
		Assert.assertNotEquals(actualPrices, expectedPrices);
	}

}

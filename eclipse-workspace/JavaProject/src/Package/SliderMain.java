package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Search for "sofa"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sofa", Keys.ENTER);
        Thread.sleep(3000);

        // Define slider and price range variables
        int sliderMin = 0;
        int sliderMax = 100;
        int minPrice = 0;
        int maxPrice = 100000;
        int lowerSliderValue = 25;  // we will use this to set and calculate the price
        // JavaScriptExecutor to set slider and calculate price
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Find and set right (upper bound) slider
        WebElement rightSlide = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '150'; arguments[0].dispatchEvent(new Event('change'));", rightSlide);

        // Find and set left (lower bound) slider
        WebElement leftSlide = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));

       

        String script =
            "arguments[0].value = " + lowerSliderValue + ";" +
            "arguments[0].dispatchEvent(new Event('change'));" +
            "var minPrice = " + minPrice + ";" +
            "var maxPrice = " + maxPrice + ";" +
            "var sliderMin = " + sliderMin + ";" +
            "var sliderMax = " + sliderMax + ";" +
            "var price = minPrice + (" + lowerSliderValue + " * (maxPrice - minPrice)) / (sliderMax - sliderMin);" +
            "return price;";

        // Execute the script and get the calculated price
        Object result = js.executeScript(script, leftSlide);

        System.out.println("Lower Range Price: ₹" + result);

        // Optional wait to observe changes
        Thread.sleep(3000);

      //  driver.quit();

	}

}

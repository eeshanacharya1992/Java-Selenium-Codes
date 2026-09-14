package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
    Thread.sleep(3000);
    List<WebElement> auto= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
   int count= auto.size();
   System.out.println(count);
 //  auto.get(1).click();
 // System.out.println(auto.get(1).getText());
   System.out.println(auto.get(1).getText());
   auto.get(1).click();
	}

}

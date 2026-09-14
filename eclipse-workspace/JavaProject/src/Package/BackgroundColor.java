package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BackgroundColor {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	      driver.get("https://grotechminds.com/automate-me/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      WebElement e1= driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[3]"));
//Actions a1= new Actions(driver);
//a1.moveToElement(e1).perform();
//WebElement e1=    driver.findElement(By.linkText("Login"));
	Thread.sleep(4000);
			//String s=e1.getCssValue("background-color");
String s=e1.getCssValue("background-color");
System.out.println(s);	 

	}

}

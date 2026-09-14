package Package;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("div1"));
		WebElement drop = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		// Thread.sleep(4000);
		WebElement drag11 = driver.findElement(By.id("drag2"));
		WebElement drop11 = driver.findElement(By.xpath("(//div[@id='div1'])[2]"));
		a1.dragAndDrop(drag11, drop11).perform();
       
	}

}

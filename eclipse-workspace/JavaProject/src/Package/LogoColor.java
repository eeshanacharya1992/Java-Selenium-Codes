package Package;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoColor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo=	driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']"));
	String color=logo.getCssValue("color");
	
	System.out.println(" text background colour of logo " + color);
	String backgroundcolor=logo.getCssValue("background-color");
	System.out.println("element background colour of logo " + backgroundcolor);
	Dimension size=	logo.getSize();
	int height=size.getHeight();
	int width=size.getWidth();
	System.out.println(height + " "+ width);

	}

}

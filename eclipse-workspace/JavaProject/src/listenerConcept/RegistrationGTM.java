package listenerConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationGTM {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://grotechminds.com/registration/");
			driver.findElement(By.name("fname")).sendKeys("eeshan");
			driver.findElement(By.name("lname")).sendKeys("acharya");
			driver.findElement(By.name("email")).sendKeys("eeshan@grotechminds.com");
			driver.findElement(By.name("password")).sendKeys("eeeeefff");
		WebElement click=	driver.findElement(By.xpath("//input[@id='male']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", click);
		//driver.findElement(By.xpath("(//div[@class='form-check'])[3]")).click();	
		//	driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		//	driver.findElement(By.cssSelector("#Female")).click();
		WebElement c1=	driver.findElement(By.id("Skills"));
		Select c3= new Select(c1);
		c3.selectByVisibleText("Technical Skills");
		//c3.selectByVisibleText("Non-Technical Skills");
		WebElement c4=	driver.findElement(By.id("technicalskills"));
		Select c5= new Select(c4);
		c5.selectByVisibleText("Python");
		driver.findElement(By.name("Present-Address")).sendKeys("eee77eefff");
		driver.findElement(By.name("Permanent-Address")).sendKeys("eee77eefffgggg");
		driver.findElement(By.name("Pincode")).sendKeys("456666");
	//Country
		WebElement f1=	driver.findElement(By.id("Country"));
		Select f2= new Select(f1);
		f2.selectByVisibleText("Afganistan ");
	// Relegion
		WebElement d1=	driver.findElement(By.id("Relegion"));
		Select d2= new Select(d1);
		d2.selectByVisibleText("Hindu");
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\dell\\Downloads\\math-keynotepaper.doc");
		// Pincode //relocate ////button[@class='btn btn-primary'] 
		//driver.findElement(By.id("relocate")).click();
		//driver.findElement(By.xpath("(//div[@class='form-check'])[3]")).click();
		//driver.findElement(By.xpath("//input[@id='relocate']")).click();
		WebElement relocate=driver.findElement(By.name("relocate"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", relocate);
		//Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("//button[@name='Submit']"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("arguments[0].click();", submit);


	}

}

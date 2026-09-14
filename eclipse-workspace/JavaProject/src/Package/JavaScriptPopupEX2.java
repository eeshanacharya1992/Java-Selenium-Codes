package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopupEX2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//https://grotechminds.com/javascript-popup/
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.xpath("//button[@class='btnjs']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}

}

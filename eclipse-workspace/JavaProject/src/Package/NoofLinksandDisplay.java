package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NoofLinksandDisplay {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int nooflinks=links.size();
		System.out.println(nooflinks);
		for(int i=0;i<nooflinks;i++)
		{
			WebElement s1=links.get(i);
			String s2=s1.getText();
		//	String s3=s1.getAttribute("href");
			String s3= s1.getDomAttribute("href");
			System.out.println(s2);
			System.out.println(s3);
			
		}
         ;
	}

}

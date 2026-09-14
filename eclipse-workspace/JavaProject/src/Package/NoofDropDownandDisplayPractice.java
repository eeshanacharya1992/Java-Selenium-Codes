package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NoofDropDownandDisplayPractice {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		WebElement s2= driver.findElement(By.id("searchDropdownBox"));
		Select sw= new Select(s2);
		List<WebElement> ss=sw.getOptions();
		int size=ss.size();
		ss.get(5).click();
		for(int i=0;i<size;i++)
		{
			WebElement f= ss.get(i);
			String ass=f.getText();
			System.out.println(ass);
		}
		String got="furniture";
		for(int i=0;i<size;i++)
		{
			WebElement gg=ss.get(i);
		    String ssss=gg.getText();
			if(ssss.equalsIgnoreCase(got))
			{
				System.out.println("Element "+got+" is present at index "+i);
			}
			
		}

	}
	
}

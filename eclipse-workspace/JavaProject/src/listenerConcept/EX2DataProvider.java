package listenerConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EX2DataProvider {
	@DataProvider(name="Std_details")
    public Object testdata()
    {
   	 Object data[][]= new Object[][] {{"shoes"},{"mobile"},{"books"}};
   	 return data;
   	// return new Object[][] {{"shoes"},{"mobile"},{"books"}};
    }
   	@Test(dataProvider="Std_details")
   	public void scenario (String data) throws InterruptedException
   	{
   		//int sum=data +100;
   		ChromeDriver driver= new ChromeDriver();
   		driver.get("https://www.amazon.in/ref=nav_logo");
   		Thread.sleep(4000);
   		driver.navigate().refresh();
   		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data+Keys.ENTER);
   		
   		//System.out.println(data);
   	}
}

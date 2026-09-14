package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTimeout2 {
	@Test(timeOut=1000)
	public void selenium()
	{  
		ChromeDriver driver= new ChromeDriver();
	}
}

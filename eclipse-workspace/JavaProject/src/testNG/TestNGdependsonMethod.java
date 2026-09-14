package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGdependsonMethod {
	@Test(enabled=true)
	public void selenium()
	{   
		System.out.println("Hello world");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="selenium")
	public void testingrun()
	{
		System.out.println("World is full of beatutiful people");
	}
}

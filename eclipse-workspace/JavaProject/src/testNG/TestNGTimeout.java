package testNG;

import org.testng.annotations.Test;

public class TestNGTimeout {
	@Test(timeOut=10)
	public void selenium()
	{
		System.out.println("Selenium");
	}
}

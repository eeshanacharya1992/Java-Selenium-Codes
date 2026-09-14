package Package;

import org.testng.annotations.Test;

public class TestNGex {
	@Test
	public void login()
	{
		//throw new NullPointerException();
	}
	@Test(dependsOnMethods="Login")
	public void logout()
	{
		
		
	}
}

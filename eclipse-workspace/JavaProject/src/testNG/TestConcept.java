package testNG;

import org.testng.annotations.Test;

public class TestConcept {
   @Test
   public void login()
	{
		throw new NullPointerException();
	}
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
		
	}
}

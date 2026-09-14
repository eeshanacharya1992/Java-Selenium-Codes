package testNG;

import org.testng.annotations.Test;

public class TestNgInvocationCount {
	/*@Test(invocationCount=10)
    public void java()
    {
    	System.out.println("java");
    }*/
	@Test(invocationCount=123)
	public void selenium()
	{
		System.out.println("Selenium");
	}
	@Test(invocationCount=12)
	public void java()
	{
		System.out.println("java");
	}
	
}

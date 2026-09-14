package testNG;

import org.testng.annotations.Test;

public class TestNGExample3 {
	@Test(priority=-2)
    public void java()
    {
    	System.out.println("Java");
    }
    @Test(priority=-6)
    public void postman()
    {
    	System.out.println("Postman");
    }
    @Test(priority=-3)
    public void restassured()
    {
    	System.out.println("RestAssured");
    }
    @Test(priority=0)
    public void loadrunner()
    {
    	System.out.println("LoadRunner");
    }
}

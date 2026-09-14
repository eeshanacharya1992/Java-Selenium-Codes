package testNG;

import org.testng.annotations.Test;

public class Groups2 {
	 @Test(groups= {"component","integration"})
	    public void seven()
	    {
	    	System.out.println("Seven");
	    }
	    @Test(groups= {"System"})
	    public void eight()
	    {
	    	System.out.println("Eight");
	    }
	    @Test(groups= {"Smoke"})
	    public void nine()
	    {
	    	System.out.println("Nine");
	    }
}

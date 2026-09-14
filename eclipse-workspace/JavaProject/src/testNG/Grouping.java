package testNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups= {"smoke","regression"},priority=1)
    public void one()
    {
    	System.out.println("One");
    }
    @Test(groups= {"component","integration"},priority=-7)
    public void two()
    {
    	System.out.println("Two");
    }
    @Test(groups= {"System"})
    public void three()
    {
    	System.out.println("Three");
    }
    @Test(groups= {"smoke"},priority=2)
    public void four()
    {
    	System.out.println("Four");
    }
    @Test(groups= {"component"},priority=-4)
    public void five()
    {
    	System.out.println("Five");
    }
}

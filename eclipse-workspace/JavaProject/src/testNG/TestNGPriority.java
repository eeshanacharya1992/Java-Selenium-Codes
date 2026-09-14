package testNG;

import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(priority=0)
    public void add()
    {
    	System.out.println("Hello world");
    }
    @Test(priority=1)
    public void sub()
    {
    	System.out.println("Hey World is great");
    }
    @Test(priority=2)
    public void mult()
    {
    	System.out.println("Max");
    }
}

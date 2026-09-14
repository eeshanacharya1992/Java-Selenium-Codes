package testNG;

import org.testng.annotations.Test;

public class TestNGPriority2 {
	@Test(priority=4)
    public void add()
    {
    	System.out.println("Anagram");
    }
    @Test(priority=1)
    public void sub()
    {
    	System.out.println("String Buffer");
    }
    @Test(priority=5)
    public void mult()
    {
    	System.out.println("Triangle");
    }
    @Test(priority=2)
    public void mask()
    {
    	System.out.println("Maskperson");
    }
    
}

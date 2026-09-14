package testNG;

import org.testng.annotations.Test;

public class GroupingDemo {
    @Test(groups= {"smoke"})
    public void Test1()
    {
    	System.out.println("one");
    }
    
    @Test(groups= {"smoke","sanity"})
    public void Test2()
    {
    	System.out.println("Two");
    }
    
    @Test(groups= {"Regrestion","sanity"})
    public void Test3()
    {
    	System.out.println("Three");
    }
    
    @Test(groups= {"System","sanity"})
    public void Test4()
    {
    	System.out.println("four");
    }
}

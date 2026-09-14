package Package;

public class FinallyKeyword {

	public static void main(String[] args) {
		try
		{ 
			int a=1/0;
			System.out.println(a);
			System.out.println("Java");
		}
	    catch (ArithmeticException a1)
	    {
	    	System.out.println("Python");
	    }
		finally
		{
			System.out.println("Selenium");
		}

	}

}

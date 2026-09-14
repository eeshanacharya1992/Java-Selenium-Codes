package Package;

public class ExceptionHandlinginTryCatch {

	public static void main(String[] args) {
		try
		{
			int a= 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException s1)
		{ 
			
			System.out.println("ArithmeticException is handled"+s1.getMessage());
		}
		finally
		{
			System.out.println("It will always execute");
		}

	}

}

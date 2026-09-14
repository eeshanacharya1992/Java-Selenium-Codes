package proj1;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		try
		{
			
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException s)
		{
			System.out.println("Hanled");
		}
		finally
		{
			System.out.println("jo");
		}
	}

}

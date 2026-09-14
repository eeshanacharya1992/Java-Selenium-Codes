package Package;

public class ThrowKeywordEx {

	public static void main(String[] args) {
		int a=23;
		if(a<10)
		{
			System.out.println("Hello world");
		}
		else
		{
			throw new ArithmeticException("a is greater than 10");
		}

	}

}

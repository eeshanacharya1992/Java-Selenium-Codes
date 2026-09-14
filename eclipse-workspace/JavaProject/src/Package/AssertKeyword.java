package Package;

public class AssertKeyword {

	public static void main(String[] args) {
		int a=12;
		assert a>13:"a greater than 20";
		if(a>20)
		{
			System.out.println(a);
		}
		else
		{
			throw new ArithmeticException("Arithmetic");
		}

	}

}

package proj1;

public class ThrowThrows {

	public static void main(String[] args)throws NullPointerException {
		int a=1;
		if(a<1)
		{
			System.out.println("go");
		}
		else
		{
			throw new ArithmeticException("a is more than one");
		}
	}

}

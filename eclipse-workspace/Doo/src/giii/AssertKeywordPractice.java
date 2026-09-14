package giii;

public class AssertKeywordPractice {

	public static void main(String[] args) {
		int a=12;
		String d="ko";
		assert a>=12:"a is greater than equal to 12";
		
		if(a>=12)
		{
			System.out.println(a);
		}
		else
		{
			throw new ArithmeticException("Arithmetic");
		}

	}

}

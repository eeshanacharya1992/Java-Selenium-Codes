package giii;

public class ThrowThrows {

	public static void main(String[] args) throws NullPointerException, InterruptedException {
		int e=20;
		if(e<10)
		{
			System.out.println("Hello");
		}
	/*	else
		{
			throw new ArithmeticException("Age is greater");
		}
		Thread.sleep(2000);*/
		
	//	int a[]=new int[4];
	 int   a[]= {1,2,3,4};
		
		a[5]=34;
		System.out.println(a);
	}

}

package pocker;

import java.util.Scanner;

public class ScannerClass {
	int a; 
	int b;
	void add()
	{
		int sum=a+b;
		System.out.println("The Addition= " +sum);
		
	}
	void sub()
	{
		
		int sub=a-b;
		System.out.println("The Subtraction= " +sub);
	}
	void multi()
	{
		int mul=a*b;
		System.out.println("The multiplication= " +mul);
	}
	void div()
	{
	
		int div=a/b;
		System.out.println("The division= " +div);
	}
	void modulus()
	{
		int mod=a%b;
		System.out.println("The modulus= " +mod);
	}

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the values of a & b");
	
		ScannerClass s2=new ScannerClass();
		s2. a=s1.nextInt();
		 s2.b=s1.nextInt();
		s2.add();
		s2.sub();
		s2.multi();
		s2.div();
		s2.modulus();
		s1.close();
	}
}

package giii;

import java.util.Scanner;

public class ScannerNonStatic {
   static Scanner s1= new Scanner(System.in);
	 
	 
   
   void method1()
    {
    //	Scanner s1= new Scanner(System.in);
    	System.out.println("Enter an integer");
    	int a= s1.nextInt();
    	
    }
	void method2()
	{
	//	Scanner s2= new Scanner(System.in);
		System.out.println("Enter a string");
		String b= s1.next();
	}
	static void method3()
	{
	//	Scanner s3= new Scanner(System.in);
		System.out.println("Enter a boolean value");
	//	ScannerNonStatic r1= new ScannerNonStatic();
		//boolean c= r1.s1.nextBoolean();
		boolean c= s1.nextBoolean();
	}
	public static void main(String[] args) {
		ScannerNonStatic r1= new ScannerNonStatic();
		r1.method1();
		r1.method2();
		method3();

	}

}

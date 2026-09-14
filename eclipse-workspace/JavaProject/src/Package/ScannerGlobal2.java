package Package;

import java.util.Scanner;

public class ScannerGlobal2 {
	 static Scanner qa = new Scanner(System.in);
	  static int a=qa.nextInt();
	static int b=qa.nextInt();
	   
	 static void add()
     {
    	 ScannerGlobal2 qa= new ScannerGlobal2();
    	 System.out.println("Enter sum");
     int sum=qa.a+qa.b;
    	// int sum=a+b;
    	 System.out.println(sum);
     }
     static void sub()
     {
    	 ScannerGlobal2 qa= new ScannerGlobal2();
    	 System.out.println("Enter difference");
    	 int difference=qa.a-qa.b;
    	// int difference= a-b;
    	 System.out.println(difference);
     }
     static void multi()
     {
    	 ScannerGlobal2 qa= new ScannerGlobal2();
    	 System.out.println("Enter Product");
    	 int product=qa.a*qa.b;
    	// int product= a*b;
    	 System.out.println(product);
     }
     static void div()
     {
    	 ScannerGlobal2 qa= new ScannerGlobal2();
    	 int divide=qa.a/qa.b;
    //	 int divide=a/b;
    	 System.out.println(divide);
     }
     void mod()
     {
    	 int mod=a%b;
    	 System.out.println(mod);
     }
	public static void main(String[] args) {
		add();
		sub();
		multi();
		div();
		 ScannerGlobal2 qa= new ScannerGlobal2();
		 qa.mod();

	}

}

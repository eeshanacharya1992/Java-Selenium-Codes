package Package;

import java.util.Scanner;

public class ScannerGlobal {
	
	   

	    // 🔸 Global Scanner for static method
	    static Scanner qa = new Scanner(System.in);
	    static int a=qa.nextInt();
	    static int b=qa.nextInt();
	    ScannerGlobal()
	    {  System.out.println(a+b);
	    	
	    }
	     
     static void add()
     {
    	// ScannerGlobal qa= new ScannerGlobal();
    	 System.out.println("Enter sum");
    	// int sum=qa.a+qa.b;
    	 int sum=a+b;
    	 System.out.println(sum);
     }
     static void sub()
     {
    	// ScannerGlobal qa= new ScannerGlobal();
    	 System.out.println("Enter difference");
    	// int difference=qa.a-qa.b;
    	 int difference= a-b;
    	 System.out.println(difference);
     }
     static void multi()
     {
    	// ScannerGlobal qa= new ScannerGlobal();
    	 System.out.println("Enter Product");
    	// int product=qa.a*qa.b;
    	 int product= a*b;
    	 System.out.println(product);
     }
     static void div()
     {
    	// ScannerGlobal qa= new ScannerGlobal();
    	// int divide=qa.a/qa.b;
    	 int divide=a/b;
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
		 ScannerGlobal  aq= new  ScannerGlobal ();
		 aq.mod();
	}

}

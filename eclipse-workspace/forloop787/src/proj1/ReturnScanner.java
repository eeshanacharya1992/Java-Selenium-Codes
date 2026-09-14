package proj1;

import java.util.Scanner;

public class ReturnScanner {
      public static double decimaldouble()
      {
    	  Scanner m1= new Scanner(System.in);
  		System.out.println("Enter a big decimal number");
  		double a =m1.nextDouble();
  		return a;
      }
      public static float decimalfloat()
      {
    	  Scanner m1= new Scanner(System.in);
  		System.out.println("Enter a small decimal number");
  		float b =m1.nextFloat();
  		return b;
      }
      public static String Stringvalue()
      {
    	  Scanner m1= new Scanner(System.in);
  		System.out.println("Enter a letter");
  		String c =m1.next();
  		return c;
      }
      public static boolean Booleanvalue()
      {
    	  Scanner m1= new Scanner(System.in);
  		System.out.println("Enter a boolean value");
  		boolean d =m1.nextBoolean();
  		
  		return d;
  	
      }
	public static void main(String[] args) {
		System.out.println(decimaldouble());
		System.out.println(decimalfloat());
       System.out.println(Stringvalue());   
        System.out.println(Booleanvalue());
        
	}

}

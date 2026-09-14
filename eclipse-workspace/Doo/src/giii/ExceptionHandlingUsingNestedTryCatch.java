package giii;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingUsingNestedTryCatch {

	public static void main(String[] args) {
		int a=1;
		int b=0;
	//	int c=1/0;
		//System.out.println(c);
		int d1=34;
		Scanner s1=  new Scanner(System.in);
		System.out.println(d1);
	try {
		 int	c=1/0;
		   System.out.println(c);	
		
	  try {
		  System.out.println("Enter a number");
		int se=s1.nextInt();}
	  catch(InputMismatchException q)
	  {
		  System.out.println("Input");
	  }
		}
		catch(ArithmeticException d)
		{   
			try {
				 int x=3/0;
				 System.out.println(x);
			}
			catch(ArithmeticException e)
			{   
				System.out.println("Exception Arithmetic");
				try {
					int s=4/0;
					System.out.println(s);
				}
				catch(ArithmeticException f)
				{
					System.out.println("Handling of arithmeticexception");
				}
			}
		}

	}

}

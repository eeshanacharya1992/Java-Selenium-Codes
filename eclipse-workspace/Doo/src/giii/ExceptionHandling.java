package giii;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

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
		System.out.println("Enter a number");
	        int s=s1.nextInt();
		 //  int	c=1/0;
		  // System.out.println(c);
	System.out.println("Enter a number");
		int se=s1.nextInt();
		}
		catch(ArithmeticException d)
		{
			System.out.println("Exception Handled");
		}
	catch(InputMismatchException d)
	{
		System.out.println("Scanner Exception Handled");
	}
    finally
    {
    	System.out.println("Finally will execute always");
    }
	}

}

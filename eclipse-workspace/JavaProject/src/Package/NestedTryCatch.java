package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		try
		{   int a=1/0;
		    System.out.println(a);
			try
			{  
				int c=1/0;
				System.out.println(c);
			}
			catch(ArithmeticException se)
			{
				System.out.println("ArithmeticException");
			}
		}
		catch(ArithmeticException sq)
		{
		   try
		   {
			 //  Scanner se= new Scanner(System.in);
			// int sw= se.nextInt();
			//  System.out.println(sw);
			   int sw=1/0;
			   System.out.println(sw);
		   }
		   catch(ArithmeticException qae)
		   {
			   System.out.println("ArithmeticException "+qae.getMessage());
		   }
		}

	}

}

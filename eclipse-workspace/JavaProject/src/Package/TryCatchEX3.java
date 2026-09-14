package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEX3 {

	public static void main(String[] args) {
		try
		{
			 String c= null;
			 System.out.println(c.length());
			Scanner s3= new Scanner(System.in);
			int a2= s3.nextInt();
			System.out.println(a2);
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException sa)
		{
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException sw)
		{
			System.out.println("InputMismatchException");
		}
		catch(NullPointerException sa1)
		{
			System.out.println("Null Pointer Exception");
		}

	}

}

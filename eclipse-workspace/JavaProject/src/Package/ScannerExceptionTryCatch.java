package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionTryCatch {

	public static void main(String[] args) {
		try
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter a true or false");
			//int a= s1.nextInt();
			boolean a= s1.nextBoolean();
			System.out.println(a);
			
		}
		catch(InputMismatchException sw)
		{
			System.out.println(sw.getMessage());
		}

	}

}

package Package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
	
		try
		{Scanner a1= new Scanner(System.in);
	int a= a1.nextInt();
System.out.println(a);}
		catch(InputMismatchException wq)
		{
			System.out.println("ExceptionHandled");
		}
 /*  String b= null;
   System.out.println(b.length());*/
	}

}

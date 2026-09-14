package Package;

import java.util.Scanner;

public class ScannerClassEx1 {

	public static void main(String[] args) {
	   Scanner s1= new Scanner(System.in);
	   System.out.println("Enter your name");
	   String name= s1.next();
	   System.out.println("My Name is "+ name);
	   System.out.println("Enter the roll number");
	   int rollno= s1.nextInt();
	   System.out.println(rollno);
	   System.out.println("Enter a value of double datatype");
	   double value= s1.nextDouble();
	   System.out.println("The double value is "+value);
	   System.out.println("Enter a boolean value");
	   boolean s= s1.nextBoolean();
	   System.out.println("Boolean value is "+s);

	}

}

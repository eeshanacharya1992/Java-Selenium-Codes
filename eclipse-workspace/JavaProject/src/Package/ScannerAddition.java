package Package;

import java.util.Scanner;

public class ScannerAddition {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter first number for addition");
		int a= s1.nextInt();
		System.out.println("Enter second number for addition");
		int b= s1.nextInt();
		
		int c= a+b;
		System.out.println("The sum of two numbers is "+c);
		
		s1.close();

	}

}

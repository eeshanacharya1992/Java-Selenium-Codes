package giii;

import java.util.Scanner;

public class ScannerAddition {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a boolean value");
		boolean f= s1.nextBoolean();
		System.out.println("Enter the first value of addition");
       int a= s1.nextInt();
       String s2=s1.nextLine();
       System.out.println(s2);
       System.out.println("Enter the second value of addition");
       int b= s1.nextInt();
       int c= a+b;
       System.out.println("The sum of a and b is "+c);
    
	}

}

package giii;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a string value");
		String a=s1.next();
		System.out.println("Enter an integer value");
	int b=	s1.nextInt();
	System.out.println("Enter a value of byte datatype");
	byte c=s1.nextByte();
	System.out.println("Enter a value of short datatype");
	short d=s1.nextShort();
	System.out.println("Enter a value of float datatype");
	float e=s1.nextFloat();
	System.out.println("Enter a value of boolean datatype");
boolean f=	s1.nextBoolean();
System.out.println("Enter a value of long datatype");
long s=s1.nextLong();
System.out.println("Enter a value of double datatype");
double t= s1.nextDouble();
s1.close();
	}

}

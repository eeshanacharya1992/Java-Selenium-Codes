package hello;

import java.util.Scanner;

public class ScannerClass {
	static float pi=3.14f;

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("length is ");
	int a=s1.nextInt();
		//String a=s1.next();
		//System.out.println();
	System.out.print("one side is "+a);
	int b=s1.nextInt();
	//	String b= s1.next();
		System.out.print("another side is"+b);
	int c=s1.nextInt();
	//	String c= s1.next();
		System.out.println();
		System.out.println("one side is "+c);
double TriangleArea=0.5*a*b*c;
	//	String TriangleArea= "0.5*a*b*c";
		System.out.println("Area of triangle="+TriangleArea);
	int PeriTriangle=a+b+c;
	//	String PeriTriangle="a+b+c";
		System.out.println("perimeter of triangle="+PeriTriangle);
		//s1.close();				
		System.out.println("enter radius ");
		int r=s1.nextInt();
		System.out.println("radius is"+r);
		float CircleArea=pi*r*r;
		
		System.out.println("CircleArea is "+CircleArea);
		
		float PerimeterCircle=pi*r*2;
		System.out.println("CircleArea is "+PerimeterCircle);
		
		
		

	}
}

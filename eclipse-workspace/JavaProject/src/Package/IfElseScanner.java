package Package;

import java.util.Scanner;

public class IfElseScanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else
		{
			System.out.println("B is greater than A");
		}

	}

}

package arrayproblems;

import java.util.Scanner;

public class Numberpresentinarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n= sc.nextInt();
		int a1[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value of an array");
			a1[i]=sc.nextInt();
		}
		
	}

}

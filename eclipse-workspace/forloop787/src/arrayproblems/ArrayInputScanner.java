package arrayproblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputScanner {

	public static void main(String[] args) {
		int no[]=new int[3];
		Scanner s=new Scanner(System.in);
	
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter the value");
			no[i]=	s.nextInt();	
		}
		System.out.println(Arrays.toString(no));
	}
	}



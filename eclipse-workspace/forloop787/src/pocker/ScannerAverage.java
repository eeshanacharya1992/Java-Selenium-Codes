package pocker;

import java.util.Scanner;

public class ScannerAverage {

	public static void main(String[] args) {
	     Scanner s1=new Scanner(System.in);
		double	 sum=s1.nextDouble();
	      double average=s1.nextDouble();
		for(int i=1;i<1000;i++)
		{
			sum=sum+i;
			 average=sum/1000;
			
		}
		System.out.println("The sum of first 1000 numbers is "+ sum);
		System.out.println("The average of first 1000 numbers is "+average);
		
	

	}

}

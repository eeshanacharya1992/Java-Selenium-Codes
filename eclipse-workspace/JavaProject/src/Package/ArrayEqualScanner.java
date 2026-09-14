package Package;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualScanner {

	public static void main(String[] args) {
	Scanner s5= new Scanner(System.in);
	System.out.println("Enter  the size of 1st array");
	int arr1[]=new int[s5.nextInt()];
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println("For first array enter the value at index " +i);
		arr1[i]=s5.nextInt();
	}
	System.out.println("Enter  the size of 2nd array");
	int arr2[]=new int[s5.nextInt()];
	for(int j=0;j<arr2.length;j++)
	{
		System.out.println("For 2nd array enter the value at index " +j);
		arr2[j]=s5.nextInt();
	}
   if(Arrays.equals(arr1, arr2))
   {
	   System.out.println("Both arrays are equal");
   }
   else
   {
	   System.out.println("Both arrays not equal");
   }
   s5.close();
	}

}

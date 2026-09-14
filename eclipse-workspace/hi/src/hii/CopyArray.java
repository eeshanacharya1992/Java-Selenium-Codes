package hii;

import java.util.Arrays;

public class CopyArray {
	
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int n[]= new int[a.length];
	for(int i=0;i<=a.length-1;i++)
	{
		n[i]=a[i];
	}
	System.out.println("Copied Array is :"+Arrays.toString(n));
}
}

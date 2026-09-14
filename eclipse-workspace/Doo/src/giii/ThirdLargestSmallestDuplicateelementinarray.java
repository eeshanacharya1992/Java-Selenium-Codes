package giii;

import java.util.Arrays;

public class ThirdLargestSmallestDuplicateelementinarray {
  public static int number(int a[], int total)
  {
	  int temp;
	  for(int i=0;i<total;i++)
	  {
		  for(int j=i+1;j<total;j++)
		  {
			  if(a[i]>a[j])
			  {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
	  }
	//  return a[total-3];
	  return a[3-1];
  }
	public static void main(String[] args) {
	    int a[]= {1,2,3,4,4};
	    System.out.println(number(a,a.length));
	    int temp;
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]>a[j])
				  {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
				  if(a[i]==a[j])
				  {
					  System.out.println("Duplicate element of array is "+a[i]);
				  }
			  }
		  }		  
		System.out.println(Arrays.toString(a));

}}
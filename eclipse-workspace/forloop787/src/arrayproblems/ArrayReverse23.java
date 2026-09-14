package arrayproblems;

import java.util.Arrays;

public class ArrayReverse23 {

	public static void main(String[] args) {
	   int array[]={1,2,3,4,5};
	 
	   int reverse[]= new int[array.length];
	   for(int i=array.length-1,j=0;i>=0;i--,j++)
	   {
		           reverse[j]=array[i];
		         
	   }
		System.out.println(Arrays.toString(reverse));
	}

}

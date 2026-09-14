package arrayproblems;

import java.util.Arrays;
import java.util.Collections;

public class SortIncreasingAndDecreasingOrder {

	public static void main(String[] args) {
		int a[]= {4,2,11,9,8};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
				
		String b=Arrays.toString(a);
	//	char b1[]= b.toCharArray();
		int  c1[]= new int[a.length];
		System.out.print("{");
		for(int i=a.length-1,j=0;i>=0 &&j<=a.length-1;i--,j++)
		{
			       c1[i]=a[i];
			   System.out.print(c1[i]+", ");
		}
		System.out.println("}");
	//	System.out.println(Arrays.toString(c1));
	}

}

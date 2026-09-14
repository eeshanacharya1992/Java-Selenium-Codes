package ifelse;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]= new int[a.length+b.length];
		
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i];
		}
       for(int j=0;j<=b.length-1;j++)
       {
    	   c[b.length+j]=b[j];
       }
       
       System.out.println(Arrays.toString(c));
	}

}

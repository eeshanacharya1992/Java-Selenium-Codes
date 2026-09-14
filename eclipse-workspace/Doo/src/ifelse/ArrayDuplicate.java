package ifelse;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicate {
    public static int smalllarge(int a[], int total)
    {  Scanner sw= new Scanner(System.in);
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
    	//return a[total-sw.nextInt()];
    	//return a[total-3];
    	//return a[3-1];
    	System.out.println(Arrays.toString(a));
    	return a[sw.nextInt()-1];
    }
	public static void main(String[] args) {
		int a[]= {1,3,2,4,4};
		System.out.println(smalllarge(a,a.length));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}

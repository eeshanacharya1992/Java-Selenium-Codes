package giii;

public class MinimumAndMaximumValuesofArray {

	public static void main(String[] args) {
		int no[]= {85,741,74,35,11,25};
		int max=no[0];
		int min= no[0];
		for(int i=0;i<=no.length-1;i++)
		{
			if(no[i]>max)
			{
				max=no[i];
			//	System.out.println(max);
			}
			if(no[i]<min)
			{
				min=no[i];
			//	System.out.println(min);
			}
		}
      System.out.println("The maximum value of array is " +max);
      System.out.println("The minimum value of array is " +min);
	}

}

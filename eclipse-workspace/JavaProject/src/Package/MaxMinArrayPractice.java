package Package;

public class MaxMinArrayPractice {

	public static void main(String[] args) {
		int a[]= {1,4,5,7};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
       System.out.println("Max "+max);
       System.out.println("Min "+min);
	}

}

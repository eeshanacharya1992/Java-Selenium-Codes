package Package;

public class SecondHighestNumber {
 public static int SecondLargest(int []a, int total)
 {
	int temp;
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];//67
				a[i]=a[j];//3
				a[j]=temp;//67
			}
		}
	}
	return a[total -2];
 }
	
	
	
	
	
	public static void main(String[] args) {
		int []a= {12,67,3,8,19,44,33};
      System.out.println(SecondLargest(a,7));
	}

}

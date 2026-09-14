package giii;

public class AveerageofArray {

	public static void main(String[] args) {
		int no[]= {10,5,30,45};
		int sum=0;
		for(int i=0;i<=no.length-1;i++)
		{
			sum=sum+no[i];
		}
       System.out.println(sum);
       double average=sum/no.length;
       System.out.println(average);
       
	}

}

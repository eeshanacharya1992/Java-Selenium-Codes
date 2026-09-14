package arrayproblems;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		int no[]= {10,5,10,15};
		int sum=0;
		for(int i=0;i<=no.length-1;i++)
		{
		sum=sum+no[i];
		}
		System.out.println(sum);
		double average=sum/no.length;
		double reminder=sum%no.length;
		System.out.println(average);
		System.out.println(reminder);
		}

	}



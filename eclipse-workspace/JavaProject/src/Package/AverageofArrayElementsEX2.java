package Package;

public class AverageofArrayElementsEX2 {

	public static void main(String[] args) {
		int no[]= {1, 2, 3,4};
		double sum=0;
		for(int i=0;i<=no.length-1;i++)
		{
			sum=sum+no[i];//sum=1// sum=3// sum=6// sum=10
		}
System.out.println(sum);
double average=sum/no.length;
System.out.println(average);
	}

}

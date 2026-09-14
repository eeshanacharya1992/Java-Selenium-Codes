package ifelse;

public class FibbonaciSeries {
  
	public static void main(String[] args) {
		int a=0;
		  int b=1;
		  System.out.print(a+" ");
		  System.out.print(b+" ");
		  for(int i=1;i<=10;i++)
		  {
			  int sum=a+b;
			  a=b;
			  b=sum;
			  System.out.print(sum+" ");
		  }
	}
	
}

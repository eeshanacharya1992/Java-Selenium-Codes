package ifelse;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,m=0,n=0;
		int o=3;
		m=o/2;
		if(o==0||o==1)
		{
			System.out.println("Not prime");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(o%i==0)
				{
					System.out.println("Not prime");
					n=1;
					break;
				}
			}
		}
		if(n==0)
		{
			System.out.println("Prime");
		}
		
	}

}

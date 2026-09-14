package ifelse;

import java.util.Scanner;

public class CommonElementsinArray {
    static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of first array");
		int m= sc.nextInt();
		System.out.println("Enter size of second array");
		int n=sc.nextInt();
		System.out.println("Enter size of third array");
		int o=sc.nextInt();
		int a[]= new int[m];
		int b[]= new int[n];
		int c[]= new int[o];
		System.out.println("Enter first array elements");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.println("Enter third array elements");
		for(int k=0;k<o;k++)
		{
			c[k]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					for(int k=0;k<o;k++)
					{
						if(b[j]==c[k])
						{
							System.out.println(a[i]);
						}
					}
				}
			}
		}
	}

}

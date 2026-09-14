package Package;

public class CommonElementsinArray {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4,9};
		int b[]= {2,6,7,8,9};
		int c[]= {3,2,1,4,9};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j])
				{ for(int k=0;k<=c.length-1;k++)
				{    if(b[j]==c[k])
					System.out.println(a[i]);
				}}
			}
		}

	}

}

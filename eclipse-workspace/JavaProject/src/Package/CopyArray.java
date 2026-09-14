package Package;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=a.length-1,j=0;i>=0&&j<a.length;i--,j++)
		{
			b[j]=a[i];
		}
System.out.println(Arrays.toString(b));

for(int i=0;i<10;i++)
{
	/*if(i==3)
	{
		continue;
		
	}*/
	if(i%2!=0) {
	System.out.println(i);}
}
	}

}

package Package;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int a[]= {2,4,5,4,4};
		
		for(int i=0,j=1;i<=a.length-1&&j<a.length;i++,j++)
		{
			if(a[i]==a[j])
					{
				         System.out.println(j);
				        
					}
			else
			{
				System.out.println("No duplicate");
				
			}
					
		}

	}

}

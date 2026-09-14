package arrayproblems;

public  class MinAndMaxValueInArray {

	public static void main(String[] args) {
		int no[]= {85,741,74,35,11,25};
		int max=no[0];
		int min=no[0];
		for(int i=0;i<=no.length-1;i++)
		{
			if(no[i]>max)
			{	max=no[i];
			}
			if(no[i]<min)
			{
				min=no[i];
			}	
		}
		System.out.println("This is maxumum no"+max);
		System.out.println("This is miniujm no"+min);
        System.out.print("{"+max);
        System.out.print(",");
        System.out.print(min+"}");
	}

}

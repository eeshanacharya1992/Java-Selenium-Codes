package proj1;

public class MaxMInArray {

	public static void main(String[] args) {
		int s[]= {1,2,3,4,5};
		int max=s[0];
		int min=s[0]; 
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i]>max)
			{
				max=s[i];
			}
			if(s[i]<min)
			{
				min=s[i];
			}
		}
           System.out.println(max);
           System.out.println(min);
	}

}

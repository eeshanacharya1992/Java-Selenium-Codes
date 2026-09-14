package arrayproblems;

public class NumberPresent {

	public static void main(String[] args) {
		 int rollno[]=new int[3];
	        rollno[0]=10;
	        rollno[1]=20;
	        rollno[2]=30;
	        int numbertocheck=30;
	        for(int i=0;i<=2;i++)
	        {
	                if(numbertocheck==rollno[i])
	                {
	                        System.out.println("number found"+rollno[i]);
	                }
	                else
	                {
	                        
	                        System.out.println("No is not available"+rollno[i]);
	                }

	}

}}

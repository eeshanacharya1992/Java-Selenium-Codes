package arrayproblems;

import java.util.Arrays;

public class CopyArrayByIterating {

	public static void main(String[] args) {
		int no[]= {543,76,98};
		 int newarray[]=new int[3];
		  
		 int n[]= new int[3];
		 for(int i=0;i<=no.length-1;i++)
		 {
		 newarray[i]=no[i];
		 }
		
		 System.out.println(Arrays.toString(newarray) );
		 boolean asnwer = Arrays.equals(no, newarray);
		 System.out.println(asnwer);
		 for(int j=no.length-1,k=0;j>=0;j--)
		 {
			// n[k]=newarray[j];
			 n[k]=no[j];
			//System.out.print(n[j]+" "); 
			 k++;
		 }
		 System.out.println(Arrays.toString(n));
	}
	}



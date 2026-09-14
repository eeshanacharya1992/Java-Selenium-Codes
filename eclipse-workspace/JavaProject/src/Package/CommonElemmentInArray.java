package Package;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElemmentInArray {
   static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the size of array 1");
		int n = sc.nextInt() ;
		System.out.println("Enter the size of array 2");
		int m = sc.nextInt() ;
		System.out.println("Enter the size of array 3");
		int o = sc.nextInt() ;
		
		int [] a1 = new int[n] ;
		int [] b1 = new int [m] ;
		int [] c1 =new int [o];
		
		System.out.println("Enter the values in array1");
		
		for (int i = 0 ; i<n ; i++)
			
		{
			a1[i] = sc.nextInt() ;
		}
		
		System.out.println("Enter the values in array2");
		
		for(int j= 0 ; j<m ;j++)
		{
			b1[j] = sc.nextInt() ;
		}
		
		System.out.println("Enter the values in array3");
		
		for(int k= 0 ; k<o ;k++)
		{
			c1[k] = sc.nextInt() ;
		}
		
		System.out.println("Array1 -->" +Arrays.toString(a1));
		System.out.println("Array2 -->" +Arrays.toString(b1));
		System.out.println("Array3 -->" +Arrays.toString(c1));

		
		for (int i = 0 ; i<n ; i++)
			
		{
			for(int j= 0 ; j<m ;j++)
				
			{
				
				
               if(a1[i] == b1[j]  )
            	   
               {
            	   for(int k = 0 ; k<o;k++)
            		   
            	   {
            	    if(b1[j] == c1[k])
            	    {
            	   System.out.println(a1[i]);
            	   
            	   }
            	    
            	   }
               }
               
				}
			
			}
			
			
		}
		
		
		

	



	}



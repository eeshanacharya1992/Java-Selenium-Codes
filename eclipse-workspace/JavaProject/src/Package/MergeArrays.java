package Package;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

	
		static Scanner sc = new Scanner (System.in) ;
		public static void main(String[] args) {
			
			System.out.println("Enter the size of array1");
			
			int n = sc.nextInt() ;
			
			System.out.println("Enter the size of array2");
			
			int m = sc.nextInt() ;
			
			System.out.println("Enter the size of array3");
			
			int o = sc.nextInt() ;
			
			int [] mergedarray = new int [n+m+o] ;
			
			int [] array1 = new int [n] ;
			
			System.out.println("Enter the values in array1");
			
			for (int i = 0 ; i<n ;i++)
			{
				array1[i] = sc.nextInt() ;
				mergedarray[i] = array1[i] ;
			}
			
			int [] array2 = new int [m] ;
			System.out.println("Enter the values in array2");
			
			for (int j = 0 ; j<m ;j++)
			{
				array2[j] = sc.nextInt() ;
				mergedarray[n+j] = array2[j] ;             
			}

			
			int [] array3 = new int [o] ;
			System.out.println("Enter the values in array3");
			
			for (int k = 0 ; k<o ;k++)
			{
				array3[k] = sc.nextInt() ;
				
				mergedarray[n+m+k] = array3[k] ; 
			}
			
			System.out.println("The array1 is ->"+Arrays.toString(array1));
			System.out.println("The array2 is ->"+Arrays.toString(array2));
			System.out.println("The array3 is ->"+Arrays.toString(array3));
			System.out.println("The merged array is ->"+Arrays.toString(mergedarray));
		}

	}



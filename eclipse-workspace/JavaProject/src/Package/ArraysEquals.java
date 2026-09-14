package Package;

import java.util.Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		String name[]= {"Sanjay","Jiten","Sambit"};
		String name1[]= {"Sanjay4","Jiten","Sambit"};
		
		boolean answer= Arrays.equals(name, name1);	
		System.out.println(answer);
		
		if(answer==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}

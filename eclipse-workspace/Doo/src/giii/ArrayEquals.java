package giii;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String name[]= {"Ram","Vishnu","Bheem"};
		String name1[]= {"Ram","Vishnu45","Bheem"};
      boolean answer= Arrays.equals(name, name1);
   //   System.out.println(answer);
     if(answer==true)
     {
    	 System.out.println("Both the arrays are equal to each other");
     }
     else
     {
    	 System.out.println("Both arrays not equal to each other");
     }
	}

}

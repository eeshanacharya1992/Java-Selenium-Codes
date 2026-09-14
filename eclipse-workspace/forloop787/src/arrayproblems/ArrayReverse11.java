package arrayproblems;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse11 {
	static void reverse(String a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
  
    public static void main(String[] args) 
    { 
       String a[] = {"Hi", "Hello", "Sumit", "Sanjay", "Right"}; 
        reverse(a); 
    } 	


}
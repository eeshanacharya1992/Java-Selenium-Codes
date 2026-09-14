package hello;

import java.util.Arrays;
import java.util.Scanner;

public class ArayConcept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//creating array of boolean data type
		System.out.println("Please enter size of an array");
	    boolean b[] = new boolean[scan.nextInt()];
	    
	    for(int i=0; i<=b.length-1;i++) {
	    	System.out.println("Please enter value of an array at index position: "+i);
	    	b[i]= scan.nextBoolean();
	    	
	    }
	    System.out.println(Arrays.toString(b));
	}

	}



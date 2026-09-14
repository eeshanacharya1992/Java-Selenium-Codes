package Package;

import java.util.Scanner;

public class Scanner33 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner(System.in);
	        String a = "";

	        // Loop until the user enters a valid option
	        while (!a.equals("M") && !a.equals("F")) {
	            System.out.println("Please enter M for male and F for female");
	            a = s1.next();

	            if (!a.equals("M") && !a.equals("F")) {
	                System.out.println("Your option selection is wrong. Please select F or M");
	            }
	        }

	        if (a.equals("F")) {
	            System.out.println("Travel free for F");
	        } else if (a.equals("M")) {
	            System.out.println("Please enter Age");
	            int age = s1.nextInt();

	            if (age < 12) {
	                System.out.println("Half ticket");
	            } else if (age >= 12 && age < 59) {
	                System.out.println("Full ticket");
	            } else {
	                System.out.println("Senior citizen");
	            }
	        }
	}

}

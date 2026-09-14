package package33;

import java.util.Scanner;

public class ScannerForm {

	public static void main(String[] args) {
	   Scanner s1= new Scanner(System.in);
	  System.out.println("Enter your First Name");
	  String FirstName=s1.next();
	  System.out.println("My first name is:" +FirstName);
	  System.out.println("Enter your Last Name");
	  String LastName=s1.next();
	  System.out.println("My last name:"+LastName);
	  System.out.println("Enter your Email");
	  String Email=s1.next();
	  System.out.println("My email id is: " +Email);
	  System.out.println("Enter your password");
	  String Password= s1.next();
	
	  System.out.println("My password is: " +Password);
	  System.out.println("Enter your gender"); 
	  String Gender=s1.next();
	  System.out.println("I am identified as: " +Gender);
	  System.out.println("Enter your present Address");
	  String PresentAddress=s1.next();
	  System.out.println("My Present Address is: " +PresentAddress);
	  System.out.println("Enter your Permanent Address");
	  String PermanentAddress=s1.next();
	  System.out.println("My Permanent Address is: " +PermanentAddress);
	  System.out.println("Enter your area PinCode");
	  String PinCode= s1.next();
	  System.out.println("My area PinCode is: "+ PinCode);
	  
	  
	  
	  

	}

}

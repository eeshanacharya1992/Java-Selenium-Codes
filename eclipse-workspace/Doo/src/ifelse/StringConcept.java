package ifelse;

public class StringConcept {

	public static void main(String[] args) {
		 String a="Hello";
			String b="World";
			
			System.out.println("Initial Value of a is "+a);
			System.out.println("Value of b is "+b);
			
			a=a+b;//  this concept is based on updating values of local variable like 
			//int a=12; a= a+12; it will give updated value of a
			System.out.println("Value of a after adding b in line 12 "+a);
   
			String d="Hi";
			d.concat("Happy");// here string immutability comes into picture
			
			System.out.println("Value of d is "+d);
			
			
	}

}

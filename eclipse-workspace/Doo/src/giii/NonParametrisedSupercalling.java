package giii;
 class hope
 {
	 hope()
	 {
		System.out.println("Hope"); 
	 }
 }
public class NonParametrisedSupercalling extends hope {
	NonParametrisedSupercalling()
	{ // super();
		System.out.println("HI");
	}
	public static void main(String[] args) {
	new NonParametrisedSupercalling();
	}

}

package pocker;

public class ThisCalling {
     ThisCalling()
     {  this(88);
    	System.out.println("6"); 
     }
     ThisCalling(int a)
     {   this("Siphon");
    	 System.out.println("5");
     }
     ThisCalling(String b)
     {
    	 System.out.println("4");
     }
	public static void main(String[] args) {
		new ThisCalling();

	}

}

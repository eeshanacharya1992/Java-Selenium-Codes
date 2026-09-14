package giii;

public class Constructors {
      Constructors()
      {this(23);
    	// this(24);
    	System.out.println("One");  
      }
      Constructors(int a)
      {  //this();
    	  this(24.3);
    	  System.out.println("Two");
      }
      Constructors(double c)
      {  //this(23);
    	 // this(23.44);
    	  System.out.println("Three");
      }
	public static void main(String[] args) {
		new Constructors();
	//	new Constructors(23);
	//	new Constructors(34.44);
      /*    String a="JO";
      System.out.println(a.contains(a));*/
       
	}

}

package giii;

public class SIBProgram {
   static 
   {
	   System.out.println("1");
   }
   static
   {
	   System.out.println("2");
   }
   static
   {
	   System.out.println("3");
   }
   {
	  System.out.println("IIB1"); 
   }
   {
	   System.out.println("IIB2");
   }
   {
	   System.out.println("IIB3");
   }
   static void add()
   {
	   System.out.println("Hello world");
   }
   void sub()
   {
	   System.out.println("Sub");
   }
   SIBProgram()
   {   this(23);
	   System.out.println("Constructor1");
   }
   SIBProgram(int a)
   {
	   System.out.println("Constructor2");
   }
	public static void main(String[] args) {
		add();
		SIBProgram aq=	new SIBProgram ();
		aq.sub();
		System.out.println("World is full of beautiful people");
       // new SIBProgram ();
	}

}

package giii;

public class MethodOverloading {
   void add()
   {
	   System.out.println("Hi");
   }
   void add(int a,long f)
   {
	   System.out.println("Hello");
   }
   static void add(String c)
   {
	   System.out.println("Hey");
   }
   static void add (long c)
   {
	   System.out.println("Hello world");
   }
   static void add(byte d)
   {
	   System.out.println("World");
   }
   
	public static void main(String[] args) {
		add(344L);
		add(344l);
		add((long)3444);
		add((byte)12);
		add("String datatype");
		MethodOverloading w1= new MethodOverloading();
	    w1.add(23,34L);
	    w1.add();

	}

}

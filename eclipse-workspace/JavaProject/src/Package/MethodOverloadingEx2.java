package Package;

public class MethodOverloadingEx2 {
   public static void main(int a)
   {
	  System.out.println(a); 
   }
   public static void main(String b)
   {
	   System.out.println(b);
   }
   public static void main(String c, int d)
   {
	   System.out.println(c+" "+d);
   }
   public static void main(byte e)
   {
	   System.out.println(e);
   }
	public static void main(String[] args) {
	main((byte)23);

	}

}

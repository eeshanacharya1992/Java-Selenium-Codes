package hii;

public class StringImmutableEx {

	public static void main(String[] args) {
		String a="Hello";
		
	String b= a.concat("World");
		System.out.println(a);
		System.out.println(b);
     int d=12;
   //  d= d+34;
     System.out.println(d);
     
     String e="Tapas";
    e= e.replaceAll("[A-Z]", "");
     System.out.println(e);
	
	}

}

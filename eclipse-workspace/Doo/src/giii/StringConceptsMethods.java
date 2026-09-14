package giii;

public class StringConceptsMethods {

	public static void main(String[] args) {
		String a="Hello";
	System.out.println("The length of the string is "+a.length());
	  String b="World";
	/*  String c= a.concat(b);
	  System.out.println(c);
	  System.out.println(b.trim());
	  System.out.println(a.charAt(1));
	  System.out.println(a.indexOf('e'));
       System.out.println(b.indexOf('r'));
       System.out.println(a.contains("faq"));
       System.out.println(a.substring(2));
       System.out.println(a.substring(2, 4));*/
       System.out.println(b.substring(1, 1));
   System.out.println(a.toUpperCase());
   System.out.println(a.toLowerCase());
    //   System.out.println(a.isEmpty());
   String c="Hello";
   System.out.println(a.equals(c));
   System.out.println(a.equals(b));
   String d="hello";
   System.out.println(a.equalsIgnoreCase(d));
    System.out.println(a.equals(d));   
    //   a=a.concat(c);
      // System.out.println(a);
	}

}

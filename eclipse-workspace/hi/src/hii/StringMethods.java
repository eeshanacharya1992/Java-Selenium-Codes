package hii;

public class StringMethods {

	public static void main(String[] args) {
		String a="Girish";
		System.out.println(a.length());
		String b= "Dash";
		System.out.println(a.concat(" "+b));
		String c="Kumar";
		System.out.println(a.concat(" "+b).concat(" "+c));
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf('s'));
		System.out.println(a.contains("m"));
		String d=" Hello World";
		System.out.println(d.trim());
		String e="";
		System.out.println(e.isEmpty());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 6));
		
		
		

	}

}

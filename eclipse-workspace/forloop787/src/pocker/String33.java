package pocker;

public class String33 {

	public static void main(String[] args) {
		String a= "Dharani";
		a.length();
		System.out.println(a.length());
		String b=" Madhabi";
		System.out.println(a.concat(b));
		String b1="Madhabika";
		System.out.println(b1.concat(a));
		System.out.println(a.concat(b).concat(b1));
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf('a'));
		System.out.println(b.indexOf('a'));
		System.out.println(b.lastIndexOf('a'));
		System.out.println(a.contains("u"));
		System.out.println(b.contains("Ma"));
		System.out.println(b.trim());
		System.out.println(a.concat(b.trim()));
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,4));
		System.out.println(a.isEmpty());
		String c="";
		System.out.println(c.isEmpty());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String e= a.concat(b);
		System.out.println(e.toUpperCase());
	
	}

}

package proj1;

public class Conversion {

	public static void main(String[] args) {
		String s="1233";
		int c= Integer.parseInt(s);
		System.out.println(c);
		String d= Integer.toString(c);
		System.out.println(d);
         char c2='2';
         int a=Character.getNumericValue(c2);
         System.out.println(a);
	}

}

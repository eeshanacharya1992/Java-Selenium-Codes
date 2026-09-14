package stringproblems;

public class StringBufferClass {

	public static void main(String[] args) {
		String s1="Manish";
		String s2=s1.concat("Tiwari");
		StringBuffer sb1= new StringBuffer("Manish");
		sb1=sb1.append(" Tiwari");
		System.out.println(sb1);
		StringBuilder sw= new StringBuilder("Looo");
		System.out.println(sw.append(" moooo"));
		System.out.println(sw.replace(0, 3, "Koop"));
	}

}

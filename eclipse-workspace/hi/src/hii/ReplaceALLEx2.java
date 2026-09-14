package hii;

public class ReplaceALLEx2 {

	public static void main(String[] args) {
		String q="HelloWorld2345";
		String r=q.replaceAll("[A-Z][a-z]", "");
		String s=q.replaceAll("[a-z][A-Z]", "");
		System.out.println(r);
		System.out.println(s);
		System.out.println(q.replace("H", "J"));

	}

}

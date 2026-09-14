package Package;

public class string {

	public static void main(String[] args) {
		String a="Helloworld";
		String a1=a.substring(0, 5);
		String a2=a.substring(5, 10);
		String a3=a1.concat(" ").concat(a2);
		System.out.println(a3);
	}

}

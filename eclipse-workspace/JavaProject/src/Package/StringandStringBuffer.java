package Package;

public class StringandStringBuffer {

	public static void main(String[] args) {
		StringBuffer sa=new StringBuffer("Hello");
		sa.append(" World");
		System.out.println(sa);
		String wa= "Hello";
		wa.concat(" World");
		System.out.println(wa);

	}

}

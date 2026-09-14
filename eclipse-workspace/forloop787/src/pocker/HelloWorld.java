package pocker;

public class HelloWorld {

	public static void main(String[] args) {
		String a ="Hello World";
		System.out.print(a.replaceAll(a, "World"));
		System.out.print(" ");
		System.out.print(a.replaceAll("World"," "));
		System.out.println(" ");
	}

}

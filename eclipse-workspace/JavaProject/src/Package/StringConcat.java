package Package;

public class StringConcat {

	public static void main(String[] args) {
		String a="Hello";
		a.concat("World");
		System.out.println(a);
      StringBuffer b= new StringBuffer("Hello");
      b.append("World");
      System.out.println(b);
	}

}

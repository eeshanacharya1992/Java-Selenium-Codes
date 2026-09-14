package pocker;

public class Repeat {

	public static void main(String[] args) {
		String name="Eeshan";
		String n1= name.repeat(3);
		System.out.println(n1);
		System.out.println(name.repeat(3));
		System.out.println(name.endsWith(n1));
		System.out.println(name.endsWith(name));
		System.out.println(name.endsWith("n"));
        System.out.println(name.repeat(5));
       String name1="GRowTech";
       System.out.println(name1.replaceAll(name1, "GROTECH"));
       System.out.println(name1.replace(name1, n1));
       
	}

}

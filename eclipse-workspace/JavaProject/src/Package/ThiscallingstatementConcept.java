package Package;

public class ThiscallingstatementConcept {
	ThiscallingstatementConcept()
	{    this("dooo");
		System.out.println("Hi");
	}
	ThiscallingstatementConcept(String a)
	{    this((byte)22);
		System.out.println("Hello");
	}
	ThiscallingstatementConcept(byte b)
	{
		System.out.println("Cookies");
	}
	public static void main(String[] args) {
		new ThiscallingstatementConcept();

	}

}

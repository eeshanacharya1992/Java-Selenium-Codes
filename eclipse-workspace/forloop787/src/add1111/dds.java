package add1111;

public class dds {
	
	static
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	dds()
	{
		System.out.println("Constructor1");
	}
	dds(int a)
	{
		System.out.println("Constructor2");
	}
public static void main(String[] args) {
	
	 new dds();
	 new dds(50);
	
}




}

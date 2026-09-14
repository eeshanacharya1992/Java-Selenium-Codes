package Package;

public class SIBIIBEX2 {
	static
    {
    	System.out.println("static 1");
    }
	static
    {
    	System.out.println("static 2");
    }
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	SIBIIBEX2()
	{   this(34);
		System.out.println("Constructor 1");
	}
	SIBIIBEX2(int a)
	{
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) {
		
            new SIBIIBEX2();
          //  new SIBIIBEX2(34);
	}

}

package hello;

public class NonStaticGlobalVariable {
	int b=23;
	void add()
    {
    	System.out.println(b);
    }
	static void sub()
	{
		NonStaticGlobalVariable sa= new NonStaticGlobalVariable();
		System.out.println(sa.b);
		System.out.println(sa.b);
	}
	public static void main(String[] args) {
		NonStaticGlobalVariable sw= new NonStaticGlobalVariable();
		sw.add();
		sub();
 //non static global variables can be utilised directly in non static methods
		//but they need object creation to be utilised in static methods
	}

}

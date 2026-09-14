package Package;

public class ConstructorEx {
	  ConstructorEx()
	{
		System.out.println("1");
	}
	ConstructorEx(int a)  
	{
		System.out.println("2");
	}
	public ConstructorEx(int a, String b)
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		   new ConstructorEx();
		   new ConstructorEx(3);
		   new ConstructorEx(4,"World");
		   
 
	}

}

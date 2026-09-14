package Package;
class SuperCallingParentEx2
{  
	SuperCallingParentEx2(int a, String b)
	{
		System.out.println("Constructor in parent class");
	}
}
public class SuperCallingStatementex2  extends SuperCallingParentEx2{
	
	
	SuperCallingStatementex2( )
	{  super(23,"Hello world");
		System.out.println("Constructor in child class1");
	}
	SuperCallingStatementex2( int c)
	{  super(23,"Hello world");
		System.out.println("Constructor in child class2");
	}
	public static void main(String[] args) {
		new SuperCallingStatementex2();
		new SuperCallingStatementex2(23);
	}

}

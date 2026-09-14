package Package;

public class ThisCallingStatementEx {
	ThisCallingStatementEx()
	{  // this("Hello world",34.56);
		System.out.println("Constructor 1");
	}
	ThisCallingStatementEx(int a)
	{   this();
		System.out.println("Constructor 2");
	}
	ThisCallingStatementEx(String a, double b)
	{   this(24); 
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) {
		//new ThisCallingStatementEx();
         new ThisCallingStatementEx("Hello",34.678);
	}

}

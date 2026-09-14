package Package;


	class Arithmeticoperator1
	{
	 void add()
	{
	System.out.println("Addition of 1 numbers");
	}
	}
	class Arithmeticoperator2
	{
	void add()
	{
	System.out.println("Addition of 8 numbers");
	}
	}
	public class Class extends Arithmeticoperator2
	{
	@Override
	void add()
	{
	super.add();
	System.out.println("Addition of 5 numbers");

	}
	public static void main(String[] args) {
	Class b1 = new Class();

	b1.add();

	}

	}



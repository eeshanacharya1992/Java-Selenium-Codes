package giii;
class gp
{
	gp(String a)
	{
		System.out.println("1");
	}
}
class p extends gp
{
	/*p(int a)
	{super("Sanjay");
		System.out.println("2");
	}*/
	p()
	{  super("Sanjay");
		System.out.println("4");
	}
}
public class SuperCallingStatement extends p {
	SuperCallingStatement()
	{ //super(45);
		System.out.println("3");
	}
	public static void main(String[] args) {
		new SuperCallingStatement();

	}

}

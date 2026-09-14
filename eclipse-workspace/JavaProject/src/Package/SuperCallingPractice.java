package Package;
class Horiuu
{
	Horiuu()
	{
		System.out.println("kkkkkk");
	}
}
class Horiuu2 extends Horiuu
{
	Horiuu2(String c)
	{
		super();
		System.out.println("POooo");
	}
}
public class SuperCallingPractice extends Horiuu2 {
	SuperCallingPractice()
	{
		super("Hello");
		System.out.println("Loooo");
	}
	public static void main(String[] args) {
		new SuperCallingPractice();

	}

}

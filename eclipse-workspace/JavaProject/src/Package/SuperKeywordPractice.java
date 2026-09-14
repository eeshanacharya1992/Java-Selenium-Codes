package Package;
class Horo
{
	void add(int a)
	{
		System.out.println("LO");
	}
}
class Moro extends Horo
{
	void add(int a)
	{    super.add(24);
		System.out.println("KO");
	}
}
public class SuperKeywordPractice extends Moro {
	void add(int a)
	{   super.add(22);
		System.out.println("JO");
	}
	public static void main(String[] args) {
		SuperKeywordPractice sw= new SuperKeywordPractice();
		sw.add(33);

	}

}

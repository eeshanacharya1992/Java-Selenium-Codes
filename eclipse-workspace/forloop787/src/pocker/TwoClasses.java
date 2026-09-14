package pocker;
class OneClass
{
	static void add()
	{
		System.out.println("Hi");
	}
	OneClass()
	{
		System.out.println("Hello");
	}
}
public class TwoClasses extends OneClass {

	public static void main(String[] args) {
		add();
        TwoClasses s1= new TwoClasses();
	}

}

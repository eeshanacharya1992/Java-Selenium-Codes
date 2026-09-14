package giii;
abstract class brake
{
	abstract void coolant();
	void airfilter()
	{
		System.out.println("It is airfilter");
	}
	static void carborator()
	{
		System.out.println("It is carburator");
	}
}
public class AbstractClass extends brake {
// abstract void add();
	public static void main(String[] args) {
		AbstractClass s1= new AbstractClass();
        s1.coolant();
        carborator();
        s1.airfilter();
	}

	@Override
	void coolant() {
		System.out.println("It is coolant");
		
	}

}

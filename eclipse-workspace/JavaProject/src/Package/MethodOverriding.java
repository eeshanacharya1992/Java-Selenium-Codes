package Package;
class MethodOverridingParent3
{
	void add(int a)
	{
		System.out.println("Addition 4");
	}
}
class MethodOverridingParent2 extends MethodOverridingParent3
{
	void add(int a)
	{   super.add(123);
		System.out.println("Addition 3");
	}
}
class MethodOverrridingParent extends MethodOverridingParent2
{
	void add(int a)
	{  // super.add(21);
		System.out.println("Addition 1");
	}
}
public class MethodOverriding extends MethodOverrridingParent {
     void add (int a)
     {   //super.add(46);
    	 System.out.println("Addition 2");
     }
	public static void main(String[] args) {
		MethodOverriding sa= new MethodOverriding();
		sa.add(34);

	}

}

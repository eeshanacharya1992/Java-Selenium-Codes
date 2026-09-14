package giii;
class Hybrid1 
{
	static void apple()
	{
		System.out.println("Apple");
	}
}
class Hybrid2 extends Hybrid1
{
	static void orange()
	{
		System.out.println("Orange");
	}
}
class Hybrid3 extends Hybrid1
{
	static void grapes()
	{
		System.out.println("Grapes");
	}
}
public class HybridLevelInheritanceEXample extends Hybrid3 {
     static void cherry()
     {
    	 System.out.println("Cherry");
     }
	public static void main(String[] args) {
		cherry();
		grapes();
		apple();
		Hybrid2.orange();
		Hybrid2.apple();
		Hybrid3.grapes();
		Hybrid3.apple();
	}

}

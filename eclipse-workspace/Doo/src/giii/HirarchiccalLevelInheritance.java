package giii;
class Lucky{
	void apple()
	{
		System.out.println("Apple");
	}
}
class Happy extends Lucky{
	void orange()
	{
		System.out.println("Orange");
	}
}
public class HirarchiccalLevelInheritance extends Lucky {
       void grapes()
       {
    	   System.out.println("grapes");
       }
	public static void main(String[] args) {
		HirarchiccalLevelInheritance s1= new HirarchiccalLevelInheritance();
		s1.grapes();
		s1.apple();
		Happy s2= new Happy();
		s2.orange();
		s2.apple();
		//new Happy().orange();
	//	new Happy().apple();

	}

}

package giii;
class GreatGrandParent
{
	static void ad()
	{
		System.out.println("ad");
	}
}
class GrandParentClass2 extends GreatGrandParent
{
	void multi()
	{
		System.out.println("Multiply");
	}
	void divide()
	{
		System.out.println("Divide");
	}
}
class ParentClass1 extends GrandParentClass2
{
	void sum()
	{
		System.out.println("sum");
	}
	void diff()
	{
		System.out.println("diff");
	}
}
public class MultiLevelInheritanceEX extends ParentClass1{
    static void home()
    {
    	System.out.println("Home");
    }
	public static void main(String[] args) {
		MultiLevelInheritanceEX  sq= new MultiLevelInheritanceEX ();
		sq.diff();
		sq.sum();
		sq.diff();
		sq.divide();
          home();
          ad();
	}

}

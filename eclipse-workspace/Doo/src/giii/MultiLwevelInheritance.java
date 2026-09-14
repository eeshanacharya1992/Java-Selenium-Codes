package giii;
class GrandParent22
{
	static void house()
	{
		System.out.println("My house");
	}
}
class Parent2 extends GrandParent22
{
	static void home()
	{
		System.out.println(" My home");
	}
}
public class MultiLwevelInheritance extends Parent2 {

	public static void main(String[] args) {
		house();
		home();
	}

}

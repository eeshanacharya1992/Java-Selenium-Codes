package giii;
class ParentInheritance
{
	static void add()
	{
		System.out.println("1");
	}
	static void sub()
	{
		System.out.println("2");
	}
}
public class SingleLevelInheritanceEx extends ParentInheritance {
    static void multi()
    {
    	System.out.println("3");
    }
	public static void main(String[] args) {
		multi();
		add();
		sub();

	}

}

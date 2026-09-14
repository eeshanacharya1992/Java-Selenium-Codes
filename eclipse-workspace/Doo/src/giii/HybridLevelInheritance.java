package giii;
class parent22{
	void add33()
	{
		System.out.println("add33");
	}
}
class parent222 extends parent22
{
	void add43()
	{
		System.out.println("add43");
	}
}
class parent66 extends parent22{
	void add77()
	{
		System.out.println("ad 77");
	}

}
public class HybridLevelInheritance extends parent66 {
    void sub()
    {
    	System.out.println("sub");
    }
	public static void main(String[] args) {
		HybridLevelInheritance wq= new HybridLevelInheritance();
		wq.add33();
		wq.add77();
		wq.sub();

	}

}

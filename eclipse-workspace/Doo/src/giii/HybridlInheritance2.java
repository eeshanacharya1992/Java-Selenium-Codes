package giii;
class parent223 extends parent2224{
	void add33()
	{
		System.out.println("add333");
	}
}
class parent2224 {
	void add43()
	{
		System.out.println("add433");
	}
}
class parent666 extends parent2224{
	void add77()
	{
		System.out.println("ad 77");
	}

}
public class HybridlInheritance2 extends parent666 {
       void sub444()
       {
    	   System.out.println("sub444");
       }


	public static void main(String[] args) {
		HybridlInheritance2 a1= new HybridlInheritance2();
		a1.add77();
		a1.add43();
        a1.sub444();

	}

}

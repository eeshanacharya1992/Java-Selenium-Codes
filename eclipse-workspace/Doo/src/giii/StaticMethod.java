package giii;
class gpar{
	static void sub()
	{
		System.out.println("1");
	}
}
		
class par extends gpar
{
	static void sub()
	{
		System.out.println("2");
	}
}
public class StaticMethod extends par{
   static  void sub()
    {  // super.sub();
    	System.out.println("3");
    }
	public static void main(String[] args) {
		sub();
		
		//StaticMethod aq= new StaticMethod();
		//aq.sub();
	}

}

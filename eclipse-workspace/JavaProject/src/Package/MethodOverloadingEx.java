package Package;

public class MethodOverloadingEx {
    void add(int a)
    {
    	System.out.println(a);
    }
    void add(int a, String b)
    {
    	System.out.println(a+" "+b);
    	
    }
    /*static void add()
    {
    	
    }*/
	public static void main(String[] args) {
		MethodOverloadingEx sw= new MethodOverloadingEx();
		sw.add(2);
		sw.add(34, "Hello World");

	}

}

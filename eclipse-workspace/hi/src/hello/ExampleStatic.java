package hello;

public class ExampleStatic {
     static void add()
     {
    	 System.out.println("Hello");
     }
     void sub()
     {
    	 System.out.println("World");
     }
	public static void main(String[] args) {
		add();
		ExampleStatic.add();
		
		ExampleStatic sw= new ExampleStatic();
		sw.sub();
		new ExampleStatic().sub();
	}

}

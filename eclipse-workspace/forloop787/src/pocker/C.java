package pocker;
class A {
   A()
   {
	   System.out.println("1");
   }
}
class B extends A {
	B()
	{
		System.out.println("2");
	}
}
public class C {
	C()
	{
		System.out.println("3");
	}

	public static void main(String[] args) {
		new C();
		new B();

	}

}

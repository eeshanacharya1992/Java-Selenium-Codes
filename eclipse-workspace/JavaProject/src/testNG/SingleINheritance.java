package testNG;
class Parent
{   
	void add()
	{
		System.out.println("Addition");
	}
	static void add2()
	{
		System.out.println("Addition2");
	}
}
public class SingleINheritance extends Parent {
     void subtract()
     {
    	 System.out.println("Subtract");
     }
	public static void main(String[] args) {
		add2();
		SingleINheritance w1= new SingleINheritance();
		w1.add();
		w1.subtract();
	}

}

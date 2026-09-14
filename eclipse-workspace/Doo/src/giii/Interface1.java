package giii;
interface Door{
	void sub();
	static void multi()
	{
		System.out.println("Multi");
	}
	default void div()
	{
		System.out.println("Divide");
	}
}
interface Room{
 void add();
}
public class Interface1 implements Room, Door {

	public static void main(String[] args) {
		Interface1 wq= new Interface1();
		wq.add();
		wq.sub();
		Door.multi();
		
      
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

}

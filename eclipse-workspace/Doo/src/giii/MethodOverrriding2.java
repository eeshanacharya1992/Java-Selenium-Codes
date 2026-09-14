package giii;
class grandparent1{
	 void add()
	{
		System.out.println("Add3");
	}
	static void add2()
	{
		System.out.println("1");
	}
	
}
class parent1 extends grandparent1{
	void add()
	{  super.add();
		System.out.println("Add1");
	//	super.add();
	}
	static void add2()
	{   
		System.out.println("2");
	}
}
public class MethodOverrriding2 extends parent1 {
	 void add()
     { super.add();
    	 System.out.println("Add2");
    	//super.add();
     }
	 static void add2()
	 {  //  super.add2();
		 System.out.println("3");
	 }
	public static void main(String[] args) {
		
		MethodOverrriding2 w= new MethodOverrriding2();
		w.add();
		add2();

	}

}

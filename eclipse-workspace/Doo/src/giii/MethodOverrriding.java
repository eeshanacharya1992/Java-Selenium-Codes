package giii;
class grandparent{
	void add()
	{
		System.out.println("Add3");
	}
	
	
}
class parent extends grandparent{
	void add()
	{  //super.add();
		System.out.println("Add1");
		//super.add();
	}
}
public class MethodOverrriding extends parent {
     void add()
     { //super.add();
    	 System.out.println("Add2");
    	// super.add();
     }
	public static void main(String[] args) {
		MethodOverrriding rq= new MethodOverrriding();
		rq.add();

	}

}

package giii;
class EA
{
	void add()
	{
		System.out.println("Addition");
	}
	void add1()
	{
		System.out.println("Addition1");
	}
}
public class UpCastingandDowncasting extends EA {
    void subtract()
    {
    	System.out.println("Subtraction");
    }
    void subtract1()
    {
    	System.out.println("Subtraction");
    }
	public static void main(String[] args) {
		EA e1= new UpCastingandDowncasting();
		e1.add();
		e1.add1();
       EA e2= (EA)new UpCastingandDowncasting();
       e2.add();
       e2.add1();
       UpCastingandDowncasting u1= (UpCastingandDowncasting)e1;
       u1.add();
       u1.add1();
       u1.subtract();
       u1.subtract1();
	}

}

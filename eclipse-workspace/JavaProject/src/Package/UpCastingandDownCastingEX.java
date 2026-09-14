package Package;
class EA
{
	void add()
	{
		System.out.println("Add");
	}
	void add1()
	{
		System.out.println("Add1");
	}
}
public class UpCastingandDownCastingEX extends EA{
      void subtract()
      {
    	  System.out.println("Subtraction");
      }
      void subtract1()
      {
    	  System.out.println("Subtraction1");
      }
	public static void main(String[] args) {
	EA e1=	 new UpCastingandDownCastingEX();//Implicit way
	e1.add();
	e1.add1();
    EA e2= (EA)new UpCastingandDownCastingEX();//Explicit way
    e2.add();
    e2.add1();
    UpCastingandDownCastingEX u1= (UpCastingandDownCastingEX)e1;
    u1.add();
    u1.add1();
    u1.subtract();
    u1.subtract1();
    
	}

}

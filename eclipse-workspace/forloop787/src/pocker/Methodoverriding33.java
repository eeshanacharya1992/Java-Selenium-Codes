package pocker;
class Arithmeticoperator42
{
      void add()
	{
		System.out.println("Addition of 3 numbers");
	}
    void subtract()
    {
    	System.out.println("Subtract23");
    }
}
public class Methodoverriding33 extends Arithmeticoperator42{
    void add()
    {
   	 System.out.println("Addition of 2 numbers");
   	 super.add();
    }
    void subtract()
    {
    	System.out.println("Subtract46");
    	super.subtract();
    }
	public static void main(String[] args) {
		Methodoverriding33 b1= new Methodoverriding33();
		b1.add();
		b1.subtract();
		
	
		}
	

}

	

package Package;// NOn parametrised super calling statement
class SuperCallingParent
{
	SuperCallingParent()
	{
	    System.out.println("Constructor 2");
	}
	
}
public class SuperCallingStatement extends SuperCallingParent{
   SuperCallingStatement()
   {  super();
	   System.out.println("Constructor 1");
   }
	public static void main(String[] args) {
		new SuperCallingStatement();

	}

}

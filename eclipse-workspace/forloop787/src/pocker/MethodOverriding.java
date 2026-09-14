package pocker;
class Arithmeticoperator4
{
      void add()
	{
		System.out.println("Addition of 3 numbers");
	}
     
}
public class MethodOverriding extends Arithmeticoperator4{
     void add()
     {
    	 System.out.println("Addition of 2 numbers");
    	 super.add();
     }
	public static void main(String[] args) {
		MethodOverriding b1 = new MethodOverriding();
		b1.add();
		
		}
	

}

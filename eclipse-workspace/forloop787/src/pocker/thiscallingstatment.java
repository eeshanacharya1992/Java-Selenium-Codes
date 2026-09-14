package pocker;

public class thiscallingstatment {
	thiscallingstatment()
	{
		this("arun",30);
		System.out.println("Name of the bank is SBI");
	}
	
	thiscallingstatment(int a)
	{
	this();
		System.out.println("acount number is"+a);
	}
	
	thiscallingstatment(String b, int c)
	
	
	{
		
		
		System.out.println("Accound holder name is-- " +b +"--Age is "+ c);
	}
	
	 thiscallingstatment(boolean b)
	
	{
		this("arun",34);
		System.out.println("Is acount existing  --- "+b);
	}
	
	
	public static void main(String[] args) {
		
	
	
}
}

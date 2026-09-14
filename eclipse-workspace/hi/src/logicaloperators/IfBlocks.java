package logicaloperators;
public class IfBlocks 
{ 
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		if(a>300 || b>150)
		{
			System.out.println("Hello");
		}
		if(a<300 && b>150)
        {
	        System.out.println("Evening");
        }
		if(!(a>300 || b<150))
		{
			System.out.println("Hi");
		}
		if(!(a>300 && b>150))
		{
			System.out.println("Morning");
		}		
	}}

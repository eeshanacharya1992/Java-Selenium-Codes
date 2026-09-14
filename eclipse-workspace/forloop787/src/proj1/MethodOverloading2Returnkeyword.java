package proj1;

public class MethodOverloading2Returnkeyword 
{
	int add(int a,int b)
    {
    	int c=a+b+100;
     	return c;
    	
    }
    static int add(int a)
    {
    	int c=a+100;
    	return c;
    	 
    }
  static  double add(double a,double b)
    {
    	double c=a+b;
    	return c;
    	
    }
	public static void main(String[] args) 
	{
		System.out.println(add(1.1,8.65));
		System.out.println(	add(10));
		MethodOverloading2Returnkeyword  m1= new MethodOverloading2Returnkeyword ();
		System.out.println(	m1.add(900, 600));
	}

}

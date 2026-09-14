package ifelse;

public class NestedIf {

	public static void main(String[] args) {
		int a=12;
		int b=14;
		if(a<b)
		{
			if(a<=b)
			{   if(a==b)
			{
				System.out.println("Hi");
			}
			else
			{
				System.out.println("Hey");
			}
				System.out.println("Count");
			}
			else
			{
				System.out.println("temp");
			}
		}
		else
		{
			System.out.println("Nothing is output");
		}
	}

}

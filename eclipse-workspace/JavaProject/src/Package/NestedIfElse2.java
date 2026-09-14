package Package;

public class NestedIfElse2 {

	public static void main(String[] args) {
		int a=12;
		if(a>12)
		{
			System.out.println("First");
		}
		else
		{
			if(a>12)
			{
				System.out.println("Second");
			}
			else
			{
				System.out.println("Third");
			}
		}

	}

}

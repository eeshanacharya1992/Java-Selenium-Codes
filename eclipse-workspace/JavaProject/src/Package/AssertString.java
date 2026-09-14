package Package;



public class AssertString {

	public static void main(String[] args) {
		String sw="Hi";
		assert sw.length()>3:"Length should be more than 3";
		if(sw.length()>3)
		{
			System.out.println("Hello world");
		}
	
	}

}

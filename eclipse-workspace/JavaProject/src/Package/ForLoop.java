package Package;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=-10;i<=100;i++)
		{
			System.out.println(i);
		}
		String str = " Hello ";

		System.out.println(str.trim());
		
		String str1 = "abc";

		String str2 = new String("abc");

		String str3 = "abc";

		System.out.println(str1 == str2);

		System.out.println(str1 == str3);

		System.out.println(str2 == str3);
	}

}

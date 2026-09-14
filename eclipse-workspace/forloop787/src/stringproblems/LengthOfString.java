package stringproblems;

public class LengthOfString {
   
	public static void main(String[] args) {
		String a="Rahul";
		int length= a.length();
		System.out.println(length);
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}

}

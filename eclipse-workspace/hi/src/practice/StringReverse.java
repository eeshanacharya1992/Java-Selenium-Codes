package practice;

public class StringReverse {

	public static void main(String[] args) {
		String a="Hello";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
          System.out.println(b);
	}

}

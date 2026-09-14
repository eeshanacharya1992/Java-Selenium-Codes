package proj1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="triangle";
		String b="integral";
		if(a.length()!=b.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char c[]=a.toCharArray();
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
			char d[]=b.toCharArray();
			Arrays.sort(d);
			System.out.println(Arrays.toString(d));
			if(Arrays.equals(c, d)==true)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
	}

}

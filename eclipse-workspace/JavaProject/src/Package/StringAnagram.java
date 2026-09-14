package Package;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String a="triangle";
		String b="integral";
		if(a.length()!=b.length())
		{
			System.out.println("Not anagram");
		}
		else
		{
			char c[]=a.toCharArray();
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
			char d[]=b.toCharArray();
			Arrays.sort(d);
			System.out.println(Arrays.toString(d));
			boolean e= Arrays.equals(c, d);
			if(e==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}

}

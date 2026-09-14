package stringproblems;

import java.util.Arrays;

public class Anagram22 {

	public static void main(String[] args) {
		String a="triangle";
		String b="integral";
		if(a.length()!=b.length())
			{
			    System.out.println("not anagram");
			}
		else {
			char a1[]=a.toCharArray();
			char b1[]=b.toCharArray();
			Arrays.sort(a1);
			System.out.println(Arrays.toString(a1));
			Arrays.sort(b1);
			System.out.println(Arrays.toString(b1));
			if((Arrays.equals(a1, b1))==true)
			{
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
	}

}

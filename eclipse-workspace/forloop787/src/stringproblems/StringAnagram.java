package stringproblems;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String first="vishnu";
		String second="vishnu";
		
		if(first.length()!=second.length())
		{
			System.out.println("The 2 strings are not anagram of each other");
		}
		else
		{
			char input1[]=	first.toCharArray();
			char input2[]=	second.toCharArray();
			Arrays.sort(input1);
			System.out.println(Arrays.toString(input1));
			Arrays.sort(input2);
			System.out.println(Arrays.toString(input2));
			if(	Arrays.equals(input1, input2)==true)
			{
			System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
		}

	}

}

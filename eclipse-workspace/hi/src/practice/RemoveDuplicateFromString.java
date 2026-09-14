package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str="Programming";
		StringBuilder sb2= new StringBuilder();
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
		set.add(str.charAt(i));
		}
		for(Character c:set)
		{
		sb2.append(c);
		}
		System.out.println(sb2);
		}

	}



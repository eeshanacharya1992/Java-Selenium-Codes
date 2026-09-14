package stringproblems;

import java.util.Arrays;

public class SplittedString {

	public static void main(String[] args) {
		String s1="India is a country";
		String splittedcalue[]= s1.split(" ", 5);
		System.out.println(Arrays.toString(splittedcalue));
	}

}

package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString22 {

	public static void main(String[] args) {
		String text = "hello";

		// 1. Create a LinkedHashSet to hold unique characters
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		// 2. Add each character to the set (sets automatically ignore duplicates)
		for (char ch : text.toCharArray()) {
		    set.add(ch);
		}

		// 3. Build the final string from the unique characters
		StringBuilder result = new StringBuilder();
		for (char ch1 : set) {
		    result.append(ch1);
		}

		// 4. Print the result
		System.out.println(result.toString()); // Output: helo

	}

}

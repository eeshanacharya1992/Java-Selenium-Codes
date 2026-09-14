package practice;

import java.util.HashMap;

public class OccuranceOfEachCharacterUsingHashMap22 {

	public static void main(String[] args) {
String text = "hello";
        
        // 1. Create the HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // 2. Loop through the string
     //   for (int i = 0; i < text.length(); i++) {
      //      char ch = text.charAt(i);
        for (char ch : text.toCharArray()) {
            // 3. Update the count
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // 4. Print the result
        System.out.println(map); 

	}

}

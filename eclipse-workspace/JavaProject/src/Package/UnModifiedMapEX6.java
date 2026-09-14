package Package;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnModifiedMapEX6 {

	
		public static void main(String[] args) {
			 // Creating a modifiable Map
			 Map<Integer, String> modifiableMap = new HashMap<>();
			 modifiableMap.put(1, "Java");
			 modifiableMap.put(2, "Python");
			 modifiableMap.put(3, "C++");
			 // Creating an unmodifiable Map
			 Map<Integer, String> unmodifiableMap =
			Collections.unmodifiableMap(modifiableMap);
			 // Accessing elements (allowed)
			 System.out.println("Unmodifiable Map: " + unmodifiableMap);
			 // Attempting to modify (throws UnsupportedOperationException)
			 unmodifiableMap.put(4, "JavaScript"); // This will throw an
		//	exception


	}

}

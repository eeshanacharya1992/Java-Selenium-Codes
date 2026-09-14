package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAllEx16 {

	
		public static void main(String[] args) {
			 List<String> list = new ArrayList<>(Arrays.asList("Java", "Python",
			"Java", "C++", "Java"));
			 // Replace "Java" with "Kotlin"

			Collections.replaceAll(list, "Java", "Kotlin");
			 System.out.println("List after replaceAll: " + list);

	}

}

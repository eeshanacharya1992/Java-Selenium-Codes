package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillMethodEx13 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python",
				"C++", "JavaScript"));
				 // Replace all elements with "Unknown"
				 Collections.fill(list, "Unknown");
				 System.out.println("List after fill: " + list);

	}

}

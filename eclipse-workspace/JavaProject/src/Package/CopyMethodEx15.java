package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyMethodEx15 {

	public static void main(String[] args) {
		List<String> source = Arrays.asList("Java", "Python", "C++");
		 List<String> destination = new ArrayList<>(Arrays.asList("A", "B",
		"C"));
		 System.out.println("Source before copy " + source);
		 // Copy source list into destination list
		 Collections.copy(source, destination);
		 System.out.println("Source after copy: " + source);

	}

}

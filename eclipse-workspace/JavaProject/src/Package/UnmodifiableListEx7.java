package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListEx7 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python"));
		System.out.println(list);
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		unmodifiableList.add("C++"); // Throws UnsupportedOperationException
list.add("Hello");
//System.out.println(list);
	}

}

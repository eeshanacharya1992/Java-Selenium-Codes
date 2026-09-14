package Package;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsEx4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);


		// Rotating right by 2 positions
		 Collections.rotate(list, 2);

		 System.out.println(list); // Output: [4, 5, 1, 2, 3]

	}

}

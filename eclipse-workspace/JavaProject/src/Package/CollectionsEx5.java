package Package;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsEx5 {

	
		public static void main(String[] args) {
			 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

			 // Rotating left by 2 positions (use negative distance)
			 Collections.rotate(list, -4);

			 System.out.println(list); // Output: [3, 4, 5, 1, 2]


	}

}

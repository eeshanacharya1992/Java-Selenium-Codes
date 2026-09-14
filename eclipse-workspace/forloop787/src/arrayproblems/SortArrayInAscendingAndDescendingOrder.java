package arrayproblems;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInAscendingAndDescendingOrder {

	public static void main(String[] args) {
		 String name[]= {"Ram","Laxman","Sita",};
	        Arrays.sort(name);
	      System.out.println(Arrays.toString(name));
	Arrays.sort(name, Collections.reverseOrder());
	    
	System.out.println(Arrays.toString(name));

	}

}

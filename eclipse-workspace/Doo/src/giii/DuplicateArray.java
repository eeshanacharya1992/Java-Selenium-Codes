package giii;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		int array[] = {10, 20, 30, 10, 20, 30, 40, 50, 10};

        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (!seen.add(array[i])) {
                duplicates.add(array[i]);
            }
        }

        System.out.print("Duplicates are: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }

	}

}

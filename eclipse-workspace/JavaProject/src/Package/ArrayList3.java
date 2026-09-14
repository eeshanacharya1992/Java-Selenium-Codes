package Package;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		System.out.println(al); // Output: [aa, bb]
		al.clear();
		System.out.println("After Clearing the data "+al); // Output: []

	}

}

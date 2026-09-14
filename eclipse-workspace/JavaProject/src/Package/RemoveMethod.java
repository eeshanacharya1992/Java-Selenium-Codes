package Package;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		System.out.println(al); //output: [aa, bb]
		al.remove("aa");
		al.remove("dd");
		System.out.println(al); // Output: [bb]


	}

}

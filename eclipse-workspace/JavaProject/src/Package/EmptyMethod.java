package Package;

import java.util.ArrayList;

public class EmptyMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty()); // Output: false

	}

}

package Package;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add("Hello");
		al.add(null);
		System.out.println(al); // output will be [100, 200, 300]

	}

}

package Package;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aa");
		al.add("bb");
		al.add("cc");
		al.add("dd");
		System.out.println(al.size());
		System.out.println(al); // Output: [aa, bb]
		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("cc");
		al2.add("ee");
		al.removeAll(al2);
		
		System.out.println(al); // Output: [bb]
// removeAll method will remove all the elements of 2nd collection which also includes the elements which are common between first and second collection
	}

}

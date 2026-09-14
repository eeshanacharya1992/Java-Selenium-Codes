package hii;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String name1[]= {"Ram","Laxman","Sita"};
		String name2[]= {"Ram","Laxman","Sita34"};
		boolean anwer= Arrays.equals(name1, name2);
		System.out.println(anwer);
	}

}

package giii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtoArrayViceversa {

	public static void main(String[] args) {
		ArrayList s= new ArrayList();
		s.add("ko");
		s.add("lo");
		s.add("no");
		s.add("mo");
		Object []a=s.toArray();
		System.out.println(Arrays.toString(a));
        String v[]={"Hi","Jo"};
    List b=Arrays.asList(v);
    System.out.println(b);
	}

}

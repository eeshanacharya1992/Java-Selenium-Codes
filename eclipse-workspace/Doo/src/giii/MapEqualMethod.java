package giii;

import java.util.HashMap;
import java.util.Map;

public class MapEqualMethod {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("student 1", "Manish");
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		m1.put("Dibyajit", "Patra");
		System.out.println(m1);
		Map m2=new HashMap();
		m2.put("student 1", "Manish");
		m2.put("student 2", "Abhishek");
		m2.put("student 3", "Sunita");
		m2.put("student 4", "Jeetu");
		System.out.println(m2);
		boolean a1=	m1.equals(m2);
		//Checks the equality between two maps
		System.out.println(a1);

	}

}

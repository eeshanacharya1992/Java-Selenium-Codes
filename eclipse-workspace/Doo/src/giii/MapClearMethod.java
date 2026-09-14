package giii;

import java.util.HashMap;
import java.util.Map;

public class MapClearMethod {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("student 1", "Manish");
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		m1.put("student4", "Hary");
		m1.put("student 6", "Ramesh");
		
		System.out.println(m1);
		System.out.println(m1.size());
	//	m1.clear();
		//Clears and removes all the mappings
	//	System.out.println(m1);

	}

}

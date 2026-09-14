package giii;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		Map m1=new HashMap();
		//Upcasting HashMap to Map Interface
		m1.put("student 1", "Manish");
		//Adds a new key: value pair to the map
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		System.out.println(m1);

	}

}

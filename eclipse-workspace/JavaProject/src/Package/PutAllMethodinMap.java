package Package;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutAllMethodinMap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("student 1", "Manish");
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		System.out.println(m1);
		Map m2=new HashMap();
		//Copies all the mappings of the m1map into the new map m2
		m2.putAll(m1);
		System.out.println("Before adding new key- value pair "+m2);
		m2.put("Student 5", "Reeyansh");
		System.out.println("After adding new key- value pair "+m2);

	}

}

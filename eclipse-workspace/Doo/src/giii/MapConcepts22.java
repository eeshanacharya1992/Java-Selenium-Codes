package giii;

import java.util.HashMap;
import java.util.Map;

public class MapConcepts22 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("student 1", "Manish");
		m1.put("student 2", "Abhishek");
		m1.put("student 3", "Sunita");
		m1.put("student 4", "Jeetu");
		System.out.println("The elements of m1 map are " + m1);
		Map m2=new HashMap();
		//Copies all the mappings of the m1map into the new map m2
		m2.putAll(m1);
		System.out.println("The elements of m2 map after putAll method are "+ m2);
		m2.put("Student 5", "Reeyansh");
		System.out.println("After adding one key value pair we get "+m2);

	}

}

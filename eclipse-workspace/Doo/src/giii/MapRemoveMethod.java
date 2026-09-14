package giii;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveMethod {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
		Map m2=new HashMap();
		m2.putAll(m1);
		System.out.println(m2);
		m2.put("Oil", 5);
		System.out.println(m2);
		System.out.println("After Removing:");
		m2.remove("Rice");
		//Removes an element’s key mapping
		System.out.println(m2);

	}

}

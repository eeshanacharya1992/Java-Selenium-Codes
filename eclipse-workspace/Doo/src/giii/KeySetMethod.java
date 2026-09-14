package giii;

import java.util.HashMap;
import java.util.Map;

public class KeySetMethod {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		m1.put(null, null);
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		//Returns a set view of the mapped keys

	}

}

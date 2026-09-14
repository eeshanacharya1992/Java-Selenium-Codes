package giii;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentMethod {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",null);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
	//	m1.putIfAbsent("Rice", 10);
		//If the specified key is not already associated with a value associates it with the given value
	//	System.out.println(m1);

	}

}

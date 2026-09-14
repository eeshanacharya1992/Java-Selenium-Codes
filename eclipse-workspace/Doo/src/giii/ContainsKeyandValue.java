package giii;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyandValue {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		m1.put("Wheat", 45);
	//	m1.put("Cereals",25);
		m1.put("Wheat", 25);
		m1.put("Wheat", 75);
		m1.put("IceCream", 45);
		System.out.println(m1);
	//Returns a boolean value depending on whether the specified value is mapped or not
	//	System.out.println(m1.containsValue(45));
       System.out.println(m1.containsKey("Cereals"));
	}

}

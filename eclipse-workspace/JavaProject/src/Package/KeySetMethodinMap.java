package Package;

import java.util.HashMap;
import java.util.Map;

public class KeySetMethodinMap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
		System.out.println(m1.keySet());

	}

}

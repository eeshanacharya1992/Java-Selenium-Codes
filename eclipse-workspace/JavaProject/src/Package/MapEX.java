package Package;

import java.util.HashMap;
import java.util.Map;

public class MapEX {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
	//Returns a bo olean value depending on whether the specified value is mapped or not
		System.out.println(m1.containsValue(2));


	}

}

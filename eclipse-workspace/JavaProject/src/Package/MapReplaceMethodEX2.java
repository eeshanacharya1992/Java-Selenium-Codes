package Package;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceMethodEX2 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",null);
		m1.put("Sugar",3);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
		m1.replace("Rice", 22);
		
		System.out.println(m1);

	}

}

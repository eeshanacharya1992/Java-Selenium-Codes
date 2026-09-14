package giii;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethodinMap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
	//	m1.replace("Sugar", 2, 20);
		m1.replace("Rice", 10, 34);
		
		//Replaces the entry for the specified key only if currently mapped to the specified value
		System.out.println(m1);

	}

}

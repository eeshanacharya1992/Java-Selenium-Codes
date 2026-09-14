package Package;

import java.util.HashMap;
import java.util.Map;

public class GetMethodinMap {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		System.out.println(m1);
		 System.out.println(m1.isEmpty());  
		m1.clear();
		System.out.println(m1);
		//System.out.println(m1.get("Cereals"));//case sensitive means if we change the case of any letter it will give null
      System.out.println(m1.isEmpty());  
	}

}

package giii;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorinMap {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		//Upcasting from HashMap to Map Interface
		m1.put("INR","Indian Rupee");
		m1.put("USD","US Dollars");
		m1.put("CAD", "Canadian Dollars");
		m1.put("GBP","United Kingdom Pound");
		Iterator<Entry<String, String>> i1=m1.entrySet().iterator();

		while(i1.hasNext())
		{
		System.out.println(i1.next());
		}

	}

}

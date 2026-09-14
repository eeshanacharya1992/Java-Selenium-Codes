package Package;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMap {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		//Upcasting from HashMap to Map Interface
		m1.put("INR","Indian Rupee");
		m1.put("USD","US Dollars");
		m1.put("CAD", "Canadian Dollars");
		m1.put("GBP","United Kingdom Pound");
		//let's use for each loop to fetch key and value

		//fetching both key and value using entryset method
		for(Map.Entry<String,String> value1: m1.entrySet())
		{
			System.out.println(value1);
		}

	}

}

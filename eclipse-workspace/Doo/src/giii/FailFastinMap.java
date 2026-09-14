package giii;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastinMap {

	public static void main(String[] args) {
		Map<String, String> cityNames= new HashMap<String, String>();
		cityNames.put("Maharastra", "India");
		cityNames.put("NewYork", "USA");
		cityNames.put("Brisbane", "Australia");
		
		Iterator iterator= cityNames.keySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(cityNames.get(iterator.next()));
			//cityNames.put("Hamilton", "Newzeeland");
		}

	}

}

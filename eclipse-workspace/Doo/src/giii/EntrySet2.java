package giii;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet2 {

	public static void main(String[] args) {
		Map<String, Float>m1= new HashMap<String,Float>();
		m1.put("Ram", 25.36f);
		m1.put("Smita", 35.63f);
		for(Entry<String, Float> s1:m1.entrySet())
		{
			System.out.println(s1);
			
		}
	}

}

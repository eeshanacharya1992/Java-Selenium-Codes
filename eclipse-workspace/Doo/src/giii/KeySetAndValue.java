package giii;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KeySetAndValue {

	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<String,Integer>();
		//Upcasting from HashMap to Map Interface
		m1.put("Rice",10);
		m1.put("Sugar",2);
		m1.put("Jaggery", 3);
		m1.put("Cereals",25);
		//lets use for each loop to fetch key separately and value separately
		for(String key: m1.keySet())
		{
			System.out.println("Keys-> "+key);
		}
		for(Integer value: m1.values())
		{
			System.out.println("Values-> "+value);
		}
		//fetching both key and value using entryset method
		for(Entry<String, Integer> value1: m1.entrySet())
		{
			System.out.println("Key and Value -> "+value1);
		}

	}

}

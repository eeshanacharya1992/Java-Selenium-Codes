package Package;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cherry");
		for (String key : map.keySet()) {
		System.out.println(key + "->" + map.get(key));
		if (key.equals("B")) {
		map.put("D", "Date");
		}
		}
		System.out.println("Final Map: " + map);
		}
	}



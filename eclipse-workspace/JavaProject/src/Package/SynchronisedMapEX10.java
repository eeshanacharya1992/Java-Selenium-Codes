package Package;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronisedMapEX10 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		 Map<String, Integer> syncMap =
		Collections.synchronizedMap(map);
		 syncMap.put("Java", 10);
		 syncMap.put("Python", 20);
		 synchronized (syncMap) {
		 for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
		 System.out.println(entry.getKey() + " -> " +
		entry.getValue());

	}

}}}

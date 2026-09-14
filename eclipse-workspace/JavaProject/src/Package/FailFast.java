package Package;

import java.util.HashMap;
import java.util.Map;

public class FailFast {

	public static void main(String[] args) {
		Map<String ,String>map=new HashMap<>();
		map.put("X", "xylophone");
		map.put("Y", "Yam");
		map.put("Z", "Zebra");

		for(String key: map.keySet()) {
		System.out.println(key + "->" + map.get(key));
		if(key.equals("Y")) {
		map.put("W", "whole");
		}
		}

	}

}

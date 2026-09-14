package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachCharacterinStringUsingHashMap {

	public static void main(String[] args) {
		String input="programming";
	//	Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] chars=
		input.toCharArray();
		for(Character ch: chars)
		{
		if(!map.containsKey(ch))
		{
		map.put(ch, 1);
		}
		else
		{
		int value=map.get(ch);
		map.put(ch, value+1);
		}
		}
		System.out.println(map);

	}

}

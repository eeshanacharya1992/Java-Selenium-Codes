package ifelse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapConcept {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		Map<String,Integer> m1= new HashMap<String,Integer>();
		for(int i=0;i<=4;i++)
		{
			m1.put(s1.next(),s1.nextInt());
			System.out.println(m1);
		}

	}

}

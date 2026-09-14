package Package;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyString {

	public static void main(String[] args) {
String str="Tip Tap Tip Toe Tap Tip Tip";
		
		Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
		
		String []word=str.split(" ");
		
		for(String x:word)
		{
			if(mp.containsKey(x))//
			{
				mp.put(x, (mp.get(x))+1);
				
				///mp.put(Tip,1+1)
				
				//mp.put(Tap,2)
			}
			
			else
			{
				mp.put(x, 1);
			}
		}
		
		for(Map.Entry y:mp.entrySet())
		{
			System.out.print(y.getKey()+"  ");
			System.out.println(y.getValue());
			
			
			
			
			
		}
		
		
		int maxFrequency=0;
		String maxOccurringString =" ";
		
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
	        if (entry.getValue() > maxFrequency) {
	            maxFrequency = entry.getValue();
	            maxOccurringString = entry.getKey();
	        }
	    }
		
		  System.out.println("Maximum occurring character: '" + maxOccurringString + "' with a frequency of " + maxFrequency);
		
		  
		  System.out.println();
		  System.out.println();
		  
		  int minFrequency=5;
			String minOccurringString ="";
		  for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		        if (entry.getValue() > minFrequency) {
		        	minFrequency = entry.getValue();
		        	minOccurringString = entry.getKey();
		        }
		        
		        
		        
		       
		    }
			
			  System.out.println("Maximum occurring character: '" + minOccurringString + "' with a frequency of " + minFrequency);
			  System.out.println("Maximum Occurence is " +Collections.max(mp.values()));
			  
			  System.out.println(Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey());
		


	}

}

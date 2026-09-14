package stringproblems;

import java.util.Arrays;

public class StringBuffer22 {

	public static void main(String[] args) {
		String a= "Once upon a time";
		StringBuffer story = new StringBuffer(a); 
		
		story.append(", there was a dragon.");
		 story.insert(29, " brave");
      story.append(" who guarded a treasure.");
     
		 System.out.println(story);
		StringBuffer rec= new StringBuffer();
		rec.append("Madam");
		rec.reverse();
		System.out.println(rec);
       
	}

}

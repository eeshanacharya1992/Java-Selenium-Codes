package giii;

public class StringBufferConceptAppend {

	public static void main(String[] args) {
		StringBuffer d= new StringBuffer("Sourav Ganguly");
		d.append(" Captain");
		System.out.println(d);
      String s= new String("Grotech");
      System.out.println(s);
    //  StringBuffer e="Harish";
      
      StringBuffer story = new StringBuffer("Once upon a time");

      story.append(", there was a dragon.");

      story.insert(29, " brave");

      story.append(" who guarded a treasure.");

      System.out.println(story);
      
	}

}

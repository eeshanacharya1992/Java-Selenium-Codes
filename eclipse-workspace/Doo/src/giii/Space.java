package giii;

public class Space {

	public static void main(String[] args) {
		boolean s2= false;
		String tue="Idea234 123";
		char s1[]=tue.toCharArray();
		for(int i=0;i<tue.length();i++)
		{
			s2= Character.isWhitespace(s1[i]);
			
		
         if(s2==true)
         {
        	 System.out.println("White space");
         }
        
		}
		
		
	}

}

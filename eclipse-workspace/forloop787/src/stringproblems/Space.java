package stringproblems;

public class Space {

	public static void main(String[] args) {
		boolean s2=false; 
		String idea="Idea143 123";
			char s1[]=	idea.toCharArray();
			for(int i=0;i<idea.length();i++)
			{			
			 s2=	Character.isWhitespace(s1[i]);
			
			if(s2==true)
			{
				System.out.println("Hello space");
				
			}
			
	}

	}}

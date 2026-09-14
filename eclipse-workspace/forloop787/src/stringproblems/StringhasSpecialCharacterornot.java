package stringproblems;

public class StringhasSpecialCharacterornot {

	public static void main(String[] args) {
		boolean space=false;
		boolean alpha=false;
		boolean digit=false;
		int countofchar=0;
		int countofdigit=0;
		int countofspace=0;
		String idea="Man@123^";
		System.out.println("Given String is:->"+idea);
			char s1[]=	idea.toCharArray();
			for(int i=0;i<idea.length();i++)
			{			
				space=	Character.isWhitespace(s1[i]);
			alpha=Character.isAlphabetic(s1[i]);
			digit=Character.isDigit(s1[i]);
			 if(space==true)
			 {
				 countofspace++;
			 }
			 if(alpha==true)
			 {
				 countofchar++;
			 }
			 if(digit==true)
			 {
				 countofdigit++;
			 }
			
			}
			 System.out.println("Space are->"+countofspace+" In the given String");
				System.out.println("Characters are->"+countofchar +" In the given String");
				System.out.println("Digits are->"+countofdigit+" In the given String");
				if(idea.length()!=(countofchar+countofspace+countofdigit))
				{
					System.out.println("The given Sting has special character in it");
				}
				else
				{
					System.out.println("No special character found");
				}
			
	}

}

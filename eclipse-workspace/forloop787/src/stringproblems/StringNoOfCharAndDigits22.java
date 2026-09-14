package stringproblems;

public class StringNoOfCharAndDigits22 {

	public static void main(String[] args) {
		String a="Abhinash 1234 ";
		int alpha=0; int spaces=0;
		int digit=0;
		char b[]=a.toCharArray();
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean letter=Character.isAlphabetic(b[i]);
			if(letter==true)
				{
				   alpha++; 
				}
			boolean number=Character.isDigit(b[i]);
			if(number==true)
			{
				digit++;
			}
			boolean whitespace=Character.isWhitespace(b[i]);
			if(whitespace==true)
			{
				spaces++;
			}
		}
                    System.out.println("No of letters "+alpha);
                    System.out.println("No of digits "+digit );
                    System.out.println("No of spaces "+spaces);
                    
	}
	

}

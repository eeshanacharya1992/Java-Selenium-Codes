package stringproblems;

public class CheckingifStringHasonlyDigits {

	public static void main(String[] args) {
		int digit=0;
		int charater=0;

	String name="123";
	char name1[]=	name.toCharArray();
		for(char i : name1)
		{	
			boolean answer=	Character.isDigit(i);	
		if(answer==true)
		{ 
			digit++;
		}
		else
		{
			charater++;
		}
		
		}
		System.out.println("Numbers of numeric's in the given String are:"+digit);
		System.out.println("Numbers of characters in the given String are:"+charater);
		if(name.length()==digit)
		{
			System.out.println("Your String is just made up of Numeric value");
	}
		
	}

}

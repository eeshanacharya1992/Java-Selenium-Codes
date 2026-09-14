package Package;

public class StringNoofCharandDigits {

	public static void main(String[] args) {
		String name="Rahul1234 yy u@#";
		System.out.println("Length of the string is "+name.length());
		char c[]=name.toCharArray();
		int digitcount=0; int spacecount=0;
		int alphacount=0; int specialcharcount=0;
		for(int i=0;i<name.length();i++)
		{
			boolean value=Character.isDigit(c[i]);
			
			boolean alphabet =Character.isAlphabetic(c[i]);
			boolean whitespace =Character.isSpaceChar(c[i]);
			if(value==true)
			{
				digitcount++;
			}
			else if(alphabet==true)
			{
				alphacount++;
			}
			
			else if(whitespace==true)
			{
				spacecount++;
			}
			else
			{
				specialcharcount++;
			}
		}
		System.out.println("Number of digits "+digitcount);
		System.out.println("Number of alphabets "+alphacount);
		System.out.println("Number of white spaces "+spacecount);
		System.out.println("Number of special characters "+specialcharcount);
      if(name.length()!=(alphacount+digitcount+spacecount))
      {
    	  System.out.println("The given string has special character in it");
      }
      else
      {
    	  System.out.println("No special character is present");
      }
	}

}

package practice;

public class NoOfCharDigitsInString {

	public static void main(String[] args) {
		String a="Hello123 #";
		char a1[]=a.toCharArray();
		int alpha=0;int digit=0;int space=0;int spec=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			boolean sw= Character.isAlphabetic(a1[i]);
			boolean sq= Character.isDigit(a1[i]);
			boolean sa= Character.isSpaceChar(a1[i]);
			if(sw==true)
			{
				alpha++;
			}
			else if(sq==true)
			{
				digit++;
			}
			else if(sa==true)
			{
				space++;
			}
			else
			{
				spec++;
			}
		}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(space);
		System.out.println(spec);
      if(a.length()==alpha+digit+space+spec)
      {
    	  System.out.println("Special characters");
      }
      else
      {
    	  System.out.println("No special characters");
      }
	}

}

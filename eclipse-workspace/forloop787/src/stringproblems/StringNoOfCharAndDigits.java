package stringproblems;

public class StringNoOfCharAndDigits {

	public static void main(String[] args) {
		String name= "Rahul1234 yy u";
		char c[]=name.toCharArray();
		int count=0;int co=0;
		int temp=0;
		for(int i=0; i<name.length();i++)
		{  
			boolean value=Character.isDigit(c[i]);
			if(value==true)
			{
				count++;
			
			}
			else
				temp++;
			boolean space=Character.isSpaceChar(c[i]);
			
			if(space==true)
			{
				co++;
			}
		}
        System.out.println("The number of digits are:"+count );
       System.out.println("The number of characters are:"+temp);
		System.out.println("Spaces "+co);
	
	}

}

package Package;

public class NoofCHarDigitsPractice {

	public static void main(String[] args) {
		String a="Ramu1234";
		char b[]=a.toCharArray();
		int count=0;
		int temp=0;
		
		for(int i=0;i<a.length();i++)
		{
			boolean letter=Character.isAlphabetic(b[i]);
			if(letter==true)
			{
				count++;
			}
			boolean digit= Character.isDigit(b[i]);
			if(digit==true)
			{
				temp++;
			}
		}
                System.out.println(count);
                System.out.println(temp);
	}

}

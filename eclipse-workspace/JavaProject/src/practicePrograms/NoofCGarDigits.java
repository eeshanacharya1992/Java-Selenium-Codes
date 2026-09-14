package practicePrograms;

public class NoofCGarDigits {

	public static void main(String[] args) {
		String a= "Tama234 @#";
		char b[]=a.toCharArray();
		int count=0; int temp=0; int space=0; int spes=0;
		for(int i=0; i<=a.length()-1;i++)
		{
			boolean a1= Character.isAlphabetic(b[i]);
			boolean a2=Character.isDigit(b[i]);
			boolean a3= Character.isWhitespace(b[i]);
			if(a1==true)
			{
				count++;
			}
			else if(a2==true)
			{
				temp++;
			}
			else if(a3==true)
			{
				space++;
			}
			else
			{
				spes++;
			}
		}
		System.out.println(count);
		System.out.println(temp);
		System.out.println(space);
		System.out.println(spes);
		if(a.length()==count+temp+space+spes)
		{
			System.out.println("special chracter");
		}
		else
		{
			System.out.println("no special character");
		}

	}

}

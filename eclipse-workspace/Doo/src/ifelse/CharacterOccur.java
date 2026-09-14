package ifelse;

public class CharacterOccur {

	public static void main(String[] args) {
		String a="aaabbbxx";
		StringBuilder sa= new StringBuilder();
		int count=1;
		
		for(int i=1;i<a.length();i++)
		{
			if(a.charAt(i)==a.charAt(i-1))
			{
				count++;
			}
			else
			{
				sa.append(a.charAt(i-1)).append(count);
				count=1;
			}
		}
         sa.append(a.charAt(a.length()-1)).append(count) ;
         System.out.println(sa.toString());
	}

}

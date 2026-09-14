package ifelse;

public class OccuranceofCharacter {

	public static void main(String[] args) {
		String s="eeefffss";
		StringBuilder sw= new StringBuilder();
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			else
			{
				sw.append(s.charAt(i-1)).append(count);
				count=1;
			}
			//sw.append(s.charAt(s.length()-1)).append(count);
		}
		sw.append(s.charAt(s.length()-1)).append(count);
       System.out.println(sw.toString());
	}

}

package ifelse;

public class StringCharacterOccurance {

	public static void main(String[] args) {
		String s="E2A1W3";
		StringBuilder sw= new StringBuilder();
		for(int i=0;i<s.length();i+=2)
		{
			char d=s.charAt(i);
			int count= Character.getNumericValue(s.charAt(i+1));
			sw.append(String.valueOf(d).repeat(count));
		}
       System.out.println(sw.toString());
	}

}

package ifelse;

public class StringCharacterBasedOnOccurancePractice {

	public static void main(String[] args) {
		String a="w3a4";
		StringBuilder sw= new StringBuilder();
		for(int i=0;i<a.length();i+=2)
		{
			char c=a.charAt(i);
			int count= Character.getNumericValue(a.charAt(i+1));
			sw.append(String.valueOf(c).repeat(count));
		}
          System.out.println(sw.toString());
	}

}

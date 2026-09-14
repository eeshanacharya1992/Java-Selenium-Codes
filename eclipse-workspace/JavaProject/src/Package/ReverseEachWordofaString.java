package Package;

public class ReverseEachWordofaString {

	public static void main(String[] args) {
		String input="Hello World";
		String[] words=input.split(" ");
		String output="";
		for(String word:words)
		{
			String reverseword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseword=reverseword+word.charAt(i);
			}
			//System.out.println(reverseword);
			output=output+reverseword;
		}
    System.out.println(output);
	}

}

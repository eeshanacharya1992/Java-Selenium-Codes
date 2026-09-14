package practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input="Automation";
		String word[]=input.split(" ");
		String output="";
		for(String wording:word)
		{
			String reverse="";
			for(int i=wording.length()-1;i>=0;i--)
			{
				reverse=reverse+wording.charAt(i);
			}
			output=output+reverse;
		}
		System.out.println(output);
	}

}

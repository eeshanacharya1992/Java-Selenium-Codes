package stringproblems;

public class Pallindrome {

	public static void main(String[] args) {
		String input="radar";
		String output="";
		String input1="ramesh";
		String output1="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char rev=input.charAt(i);
			output=output+rev;
		}
        System.out.println(output);
        if(input.equals(output))
        {
        	System.out.println("is a pallindrome");
        }
        else
        {
        	System.out.println("not a pallindrome");
        }
        for(int i=input1.length()-1;i>=0;i--)
		{
			char rev1=input1.charAt(i);
			output1=output1+rev1;
		}
        System.out.println(output1);
        if(input1.equals(output1))
        {
        	System.out.println("is a pallindrome");
        }
        else
        {
        	System.out.println("not a pallindrome");
        }
	}

}

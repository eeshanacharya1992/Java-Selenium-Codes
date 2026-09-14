package giii;

public class StringLengthWithLengthmethod {

	public static void main(String[] args) {
		String a="Rome";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			char c= a.charAt(i);
			count++;
		
		}
     System.out.println(count);
	}

}

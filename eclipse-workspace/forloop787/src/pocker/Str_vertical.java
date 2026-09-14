package pocker;

 public class Str_vertical{

	public static void main(String[] args){
		String name="India";
		String reverse="";
		for(int i=0;i<=name.length()-1; i++)
		{
		 char answer=name.charAt(i);
		reverse=reverse+answer;
		}
		if(name==reverse)
		{
		System.out.println("Given String India is Pallindrome");
		}
		else
		{
		System.out.println("Given String India is  nota Pallindrome");
		}


	
}}

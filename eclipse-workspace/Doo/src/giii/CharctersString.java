package giii;

public class CharctersString {

	public static void main(String[] args) {
		String Input = "Swathi@123";
	     int count = 0;
	     for(int i=0; i<Input.length(); i++)
	     {
	    	 char ch = Input.charAt(i);
	    	 if(Character.isLetter(ch))
	    	 {
	    		 count++;	 
	    	 }
       
	}
	     System.out.println(count);
	}}

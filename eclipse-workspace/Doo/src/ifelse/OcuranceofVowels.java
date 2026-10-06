package ifelse;

public class OcuranceofVowels {

	public static void main(String[] args) {
		String s="Welcome to TCS";
		StringBuilder sw= new StringBuilder();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{   
			
				count++;
				
			}
			else if (count > 0) {

                sw.append(s.charAt(i - 1)).append(count);
                count = 0;
            }
		 
		  
		}
		  if (count > 0) {
	            sw.append(s.charAt(s.length() - count)).append(count);
	        }
       System.out.println(sw.toString());

	}

}

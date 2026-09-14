package stringproblems;

public class StringwhichisCharwhichisNumericValue {

	public static void main(String[] args) {
		String name="manish1";
		char name1[]=        name.toCharArray();
		        for(char i : name1)
		        {        
                boolean answer=        Character.isDigit(i);        
		System.out.println(answer);

	}
         
}}

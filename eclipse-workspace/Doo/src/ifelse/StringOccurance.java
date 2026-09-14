package ifelse;

public class StringOccurance {

	public static void main(String[] args) {
		String str = "a2b3c1d0";

		StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) 
        {
            char character = str.charAt(i);  
            int count = Character.getNumericValue(str.charAt(i + 1)); 

            result.append(String.valueOf(character).repeat(count)); 
        }

        System.out.println(result.toString());

	}

}

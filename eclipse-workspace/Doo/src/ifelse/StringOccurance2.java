package ifelse;

public class StringOccurance2 {

	public static void main(String[] args) {
		 String str = "aabbbc";
	        StringBuilder result = new StringBuilder();

	        int count = 1;
	        for (int i = 1; i < str.length(); i++) {
	            if (str.charAt(i) == str.charAt(i - 1)) {
	                count++;
	            } else {
	                result.append(str.charAt(i - 1)).append(count);
	                count = 1;
	            }
	        }

	        // Append the last character and its count
	        result.append(str.charAt(str.length() - 1)).append(count);

	        System.out.println(result.toString());  // Output: a2b3c1

	}

}

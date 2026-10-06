package ifelse;

public class GodIsNameMine {

	public static void main(String[] args) {
		  String a = "My Name is God";
	        String b = "";

	        String[] words = a.split(" ");

	        for (int i = words.length - 1, j = 0; i >= 0 && j < words.length; i--, j++) {
	            b = b + words[i];

	            if (i != 0) {
	                b = b + " ";
	            }
	        }

	        System.out.println(b);

	}

}

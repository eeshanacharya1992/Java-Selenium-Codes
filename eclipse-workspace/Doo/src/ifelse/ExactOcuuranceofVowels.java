package ifelse;

public class ExactOcuuranceofVowels {

	public static void main(String[] args) {
		

		        String s = "Welcome to TCS";
		        StringBuilder sw = new StringBuilder();

		        int a = 0, e = 0, i = 0, o = 0, u = 0;

		        for (int j = 0; j < s.length(); j++) {

		            if (s.charAt(j) == 'a') {
		                a++;
		            } 
		            else if (s.charAt(j) == 'e') {
		                e++;
		            } 
		            else if (s.charAt(j) == 'i') {
		                i++;
		            } 
		            else if (s.charAt(j) == 'o') {
		                o++;
		            } 
		            else if (s.charAt(j) == 'u') {
		                u++;
		            }
		        }

		        if (a > 0)
		            sw.append("a").append(a);

		        if (e > 0)
		            sw.append("e").append(e);

		        if (i > 0)
		            sw.append("i").append(i);

		        if (o > 0)
		            sw.append("o").append(o);

		        if (u > 0)
		            sw.append("u").append(u);

		        System.out.println(sw.toString());
		    }
		}

	



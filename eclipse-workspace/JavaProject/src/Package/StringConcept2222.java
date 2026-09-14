package Package;

public class StringConcept2222 {

	public static void main(String[] args) {
		String a = "I am the best ";

        // Split the string into words
        String[] words = a.split(" ");

        int countI = 0;
        int countAm = 0;
        String reversedThe = "";

        for (String word : words) {
            if (word.equals("I")) {
                countI++;
            } else if (word.equals("am")) {
                countAm++;
            } else if (word.equals("the")) {
                reversedThe = new StringBuilder(word).reverse().toString();
            }
        }

        System.out.println("Count of 'I': " + countI);
        System.out.println("Count of 'am': " + countAm);
        System.out.println("Reversed 'the': " + reversedThe);

	}

}

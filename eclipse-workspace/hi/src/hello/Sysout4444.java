package hello;

import java.util.Scanner;

public class Sysout4444 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Ask for the first string input (though not necessary for the output)
        System.out.print("Enter first part of the output (Hello): ");
        String firstPart = scanner.nextLine();

        // Ask for the second string input (though not necessary for the output)
        System.out.print("Enter second part of the output (Lpooo): ");
        String secondPart = scanner.nextLine();

        // Display the formatted output
        System.out.println(firstPart + "33 " + secondPart + "33");

        // Close the scanner
        scanner.close();

	}

}

package Package;

public class StarPatternConcept {

	public static void main(String[] args) {
		int n = 5;
//j==2*i-1 for printing star


		for (int i = 0; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

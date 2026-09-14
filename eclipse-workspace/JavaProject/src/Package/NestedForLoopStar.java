package Package;

public class NestedForLoopStar {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();// used  after inner for loop for moving to next line

	}

}
}
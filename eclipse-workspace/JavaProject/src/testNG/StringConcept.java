package testNG;

public class StringConcept {

	public static void main(String[] args) {
		String str="hello";
		System.out.println(str);
		String str2=str;
		str=str+"world";
		str2=str;
		System.out.println("New value "+str);
		System.out.println(str2);

	}

}

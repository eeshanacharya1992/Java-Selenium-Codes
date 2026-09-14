package Package;

public class StringBuferAppend {

	public static void main(String[] args) {
		StringBuffer sq= new StringBuffer("Hello");
	//	sq.reverse();
		System.out.println(sq.length());
		System.out.println(sq.charAt(1)); 
		System.out.println(sq);
		sq.append(" World");
		
		System.out.println(sq);
		sq.insert(6, "Great ");
		System.out.println(sq);
		sq.replace(0, 5, "Huge");
		System.out.println(sq);
		sq.delete(0, 4)	;
		System.out.println(sq);
		System.out.println(sq.capacity());
		
		

	}

}

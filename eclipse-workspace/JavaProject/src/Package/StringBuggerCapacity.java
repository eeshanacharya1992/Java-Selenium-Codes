package Package;

public class StringBuggerCapacity {

	public static void main(String[] args) {
		StringBuffer sd= new StringBuffer();
		//System.out.println(sd.capacity());
		sd.ensureCapacity(50);
		System.out.println(sd.capacity());

	}

}

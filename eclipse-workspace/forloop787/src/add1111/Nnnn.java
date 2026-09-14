package add1111;
 class cccc
 {
	static void ass() {
		System.out.println("gu");
	}
	
 }
 abstract class suni extends cccc
 {
	 abstract void ee();
 }
 
public class Nnnn extends suni {
  
	public static void main(String[] args) {
	System.out.println("lu");
	Nnnn s1= new Nnnn();
	s1.ee();
	ass();
	}

	@Override
	void ee() {
		System.out.println("lo");		
	}

}

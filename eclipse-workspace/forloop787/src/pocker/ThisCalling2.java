package pocker;

public class ThisCalling2 {
	ThisCalling2(){
		this (55);
		System.out.println("1");
	}
	ThisCalling2(int a){
		
		System.out.println("2");
	}
	ThisCalling2(String b){
		this ();
		System.out.println("3");
	}
	public static void main(String[] args) {
		new ThisCalling2("Sonjeeb");
	}

}

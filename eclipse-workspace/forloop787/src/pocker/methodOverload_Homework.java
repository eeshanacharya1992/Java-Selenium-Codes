package pocker;

public class methodOverload_Homework {
	static void method1(boolean a, String b ){
		System.out.println(1);
	}
	static void method1(int c, String d) {
		System.out.println(2);
	}
	static void method1(char e, int f) {
		System.out.println(3);
	}
	static void method1(String g, char h) {
		System.out.println(4);
	}
	void method1(float i, String j) {
		System.out.println(5);
	}
	void method1(double k, float l) {
		System.out.println(6);
	}
	void method1(String m, double n) {
		System.out.println(7);	
	}
	void method1(String o) {
		System.out.println(8);
	}
public static void main(String[] args) {
	method1(false, "ki");
	method1(4,"Calcutta");	
	method1('D', 1);
	method1("Delhi", 'd');
	methodOverload_Homework r1= new methodOverload_Homework();
	r1.method1("Bombay");
	r1.method1(0.4, 5.5f);
	r1.method1(4.4f, "Delhi");
	r1.method1("Chennai",4.4);
	}
}

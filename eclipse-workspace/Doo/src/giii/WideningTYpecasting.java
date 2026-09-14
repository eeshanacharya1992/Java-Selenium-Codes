package giii;

public class WideningTYpecasting {

	public static void main(String[] args) {
		int weight=16;
		double a=weight;//implicit way of widening
		System.out.println(a);
        double b=(double)weight;//explicit way of widening
        System.out.println(b);
        double weight11=100.23;
        int convert=(int) weight11;//narrowing can be done only explicitly
        System.out.println(convert);
	}

}

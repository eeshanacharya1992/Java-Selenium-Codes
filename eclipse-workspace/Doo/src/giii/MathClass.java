package giii;

public class MathClass {
  static void add()
  {
	  double pi= Math.PI;
		double radius=23.33;
		double area= pi*radius*radius;
		System.out.println(area);
  }
	public static void main(String[] args) {
		System.out.println(Math.addExact(23, 34));
		System.out.println(Math.subtractExact(24, 12));
		System.out.println(Math.multiplyExact(23, 4));
		System.out.println(Math.floorDiv(34, 17));
		System.out.println(Math.PI);
		System.out.println(Math.random());
		System.out.println(Math.abs(12));
		System.out.println(Math.max(23, 34));
		System.out.println(Math.min(23, 12));
		System.out.println(Math.pow(2, 0.5));
		System.out.println(Math.pow(12, 2));
		MathClass.add();

	}

}

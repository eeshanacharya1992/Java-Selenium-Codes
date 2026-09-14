package Package;

public class AreaCircleMathClass {

	public static void main(String[] args) {
	//	double radius=Math.random();
		double pi= Math.PI;
		for(int i=1;i<=50;i++)
		{double radius=Math.random();
			double area = pi*radius*radius;
			System.out.println(area);
		//  System.out.println(radius);
		}

	}

}

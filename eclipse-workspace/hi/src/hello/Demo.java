package hello;

public class Demo {
	 static int x = 10;
	 int y = 20;
	  void show() {
	    System.out.println(x + " " + y);
	    x++; y++;
	  }
	
	  public static int test() {
		  try {
		    return 1;
		  } finally {
		    return 2;
		  }
		}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.show();
		d2.show();
		System.out.println(test());

	}

}

package giii;

public class StringBufferConcept {

	public static void main(String[] args) {
		StringBuffer d= new StringBuffer("Sourav Ganguly");
		System.out.println(d);
        d.insert(6, " Chandidas");
      System.out.println(d);
          d.replace(7, 14, "Gangopadhay");
          System.out.println(d);
      d.replace(17, 24, "Gangopadhay");
    System.out.println(d);
          d.delete(7, 16);
       System.out.println(d);
             d.delete(7, 17);
        System.out.println(d);
        d.delete(0, 7);
        System.out.println(d);
        d.reverse();
        System.out.println(d);
	}

}

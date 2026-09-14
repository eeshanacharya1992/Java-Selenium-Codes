package Package;

public class ThisKeyword {
     String a="d";
     int b=2;
     void add(String a, int b)
     {
    	 this.a=a;
    	 this.b=b;
    	 System.out.println(a);
    	 System.out.println(b);
     }
     
   	public static void main(String[] args) {
   		ThisKeyword sw= new ThisKeyword();
   		System.out.println(sw.a);
   		System.out.println(sw.b);
   		sw.add("g", 22);
   		System.out.println(sw.a);
   		System.out.println(sw.b);
   		
	}

}

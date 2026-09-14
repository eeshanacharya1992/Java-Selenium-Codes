package pocker;

import java.util.Date;

public class TimeHandle23 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
       Date humantime = new Date(d1.getTime());
   System.out.println(humantime);
     String human = humantime.toString();  
   //  System.out.println(human);
       String year = human.substring(24);
		System.out.println(year);
	      String month= human.substring(4, 7);
	      System.out.println(month);
	      String date= human.substring(8, 10);
	      System.out.println(date);  
          String day= human.substring(0, 3);
          System.out.println(day);
          System.out.println(d1.toString());
	}

}

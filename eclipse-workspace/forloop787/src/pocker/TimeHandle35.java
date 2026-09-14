package pocker;

import java.util.Date;

public class TimeHandle35 {

	public static void main(String[] args) {
		Date d1 = new Date();
	//	System.out.println(d1.getTime());
		d1.getTime();
        Date humantime = new Date(d1.getTime());
    //    System.out.println(humantime);
        String human = humantime.toString(); 
        String date= human.substring(8, 10);
	 //     System.out.println(date);  
	      String year = human.substring(24);
	   //   System.out.println(year);
	      String month= human.substring(4, 7);
	 //     System.out.println(month);
	      String date2= date.concat(" ").concat(month).concat(" ").concat(year);
	      System.out.println(date2);
	}

}

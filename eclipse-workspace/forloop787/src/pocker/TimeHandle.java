package pocker;

import java.util.Date;

public class TimeHandle {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
        Date humantime = new Date(d1.getTime());
        System.out.println(humantime);
       String human = humantime.toString(); 
      System.out.println(human.substring(24)); 
      String year = human.substring(24);
      System.out.println(year);
      String month= human.substring(4, 7);
      System.out.println(month);
      String date= human.substring(8, 10);
      System.out.println(date);
      String date1= date.concat(month).concat(year);
      System.out.println(date1);
      String date2= date.concat(" ").concat(month).concat(" ").concat(year);
      System.out.println(date2);
      String date3= date.concat("-").concat(month).concat("-").concat(year);
      System.out.println(date3);
      Date humantime1 = new Date(d1.getTime()+(1000*24*60*60*1));
      System.out.println(humantime1);
      Date humantime2 = new Date(d1.getTime()+(1000*24*60*60*10));
      System.out.println(humantime2);
      Date humantime3 = new Date(d1.getTime()-(1000*24*60*60*10));
      System.out.println(humantime3);
      Date humantime4 = new Date(d1.getTime()-(1000*24*60*60*1));
      System.out.println(humantime4);
      Date humantime44= new Date(d1.getTime()+(1000*24*60*60*1));
      System.out.println(humantime44);
      Date d2= new Date();
      d2.getDate();
     
	
	}

}

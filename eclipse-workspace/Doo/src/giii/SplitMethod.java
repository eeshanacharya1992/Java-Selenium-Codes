package giii;

public class SplitMethod {

	public static void main(String[] args) {
String str="TestEnvironmentdstgduatdsit";
		
		String []str1=str.split(" ");
		
	//	System.out.println(str1[1]);
    String str2="India is a republic country";
    String [] str3= str2.split(" ");
    System.out.println(str3[3]);
    String sw="TestEnvironment@stg@uat@sit";
    String []sw2=sw.split("@");
    System.out.println(sw2[2]);
	}

}

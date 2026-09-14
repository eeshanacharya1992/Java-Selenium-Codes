package arrayproblems;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String name[] = { "Ram", "Laxman", "Sita", };
		String name1[] = { "Ram", "Laxman", "Sita", };
	//	System.out.println(name[0] + name[1] + name[2]);
	
		boolean asnwer = Arrays.equals(name, name1);
		System.out.println(asnwer);
        int nom[]= {1,2,3};
        int nom2[]= {1,2,3};
        boolean ans=Arrays.equals(nom, nom2);
        System.out.println(ans);
	}

}

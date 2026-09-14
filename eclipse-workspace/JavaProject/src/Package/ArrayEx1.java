package Package;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int id[]= new int [4];
		id[0]=1;
		id[1]=345;
		id[2]=456;
		id[3]=987;
		//id[4]=2222;
		for(int i=0;i<=id.length-1;i++)
		{
			System.out.println(id[i]);
		}
//System.out.println(Arrays.toString(id));
	}

}

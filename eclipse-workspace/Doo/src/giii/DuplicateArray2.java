package giii;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray2 {

	public static void main(String[] args) {
		int array[]= {10, 20, 30, 10, 20, 30, 40, 50,10,10};
		for(int i=0; i<array.length; i++) // 10, 20, 30, 10, 20, 30, 40, 50
		{
			for(int j=i+1; j<array.length; j++) // 20, 30, 10, 20, 30, 40, 50
			{
				if(array[i]==array[j])
				{
					System.out.println("Duplicate values are: "+array[j]);
					break;
				}
			}
		}
	/*	Set<Integer> duplicates=new HashSet<>();
		Set<Integer> value=new HashSet<>();
		for(int dup:array)
		{
			if(!value.add(dup))
			{
				//System.out.println("duplicate elemenys are: "+ dup);
				duplicates.add(dup);
			}
			
		}
		System.out.println(duplicates);*/

	}

}

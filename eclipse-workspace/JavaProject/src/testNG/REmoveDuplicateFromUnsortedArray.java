package testNG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class REmoveDuplicateFromUnsortedArray {

	public static void main(String[] args) {
	int a[]= {5,4,4,3,3,1,5,3,};
	Set<Integer>set= new HashSet<Integer>();
	for(int i=0;i<=a.length-1;i++)
	{
		set.add(a[i]);
	}
      Integer []b= set.toArray(new Integer[set.size()]);
      System.out.println(Arrays.toString(b));
	}
    
}

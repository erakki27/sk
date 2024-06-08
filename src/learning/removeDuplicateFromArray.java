package learning;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,4,5,6,7,1,1,2,3,4,5,6,7,8,9,0,11,1,1,12,13,11,12};

		withoutduplicate(arr);
	}
	
	static void withoutduplicate(int arr[]) {
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>(); 
		
		for(int i=0;i<arr.length;i++) 
			hs.add(arr[i]);
			System.out.print(hs);
		
	}
}

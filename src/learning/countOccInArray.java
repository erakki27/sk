package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class countOccInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,1,5,3};
		count(a);

	}
	
	static void count(int[] a) {
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i=0; i<a.length;i++) 
		{
			
			if(mp.containsKey(a[i])) {
				mp.put(a[i], mp.get(a[i])+1);
				
			}else {
				mp.put(a[i], 1);
			}
			
		}
		
		for(Entry<Integer, Integer> entry : mp.entrySet()) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
	}
	
}

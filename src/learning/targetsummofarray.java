package learning;

import java.util.HashMap;
import java.util.Map;

public class targetsummofarray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int t= 8;
		
		
		int[] op = sum(a,t);
		
		if(op.length==2) {
			System.out.println(op[0] +" "+ op[1]);
			
		}else {
		System.out.println("no solution");
		}

	}
	
	static int[] sum(int[] a, int t) {
		
		
		Map<Integer, Integer> mp = new  HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			int c = t - a[i];
			
			if(mp.containsKey(c)) {
				return new int[] {mp.get(c),i};
				
			}
			mp.put(a[i], i);
			
		}
		return new int[] {};
		
		
		
	}

}

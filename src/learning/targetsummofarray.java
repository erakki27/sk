package learning;

import java.util.HashMap;
import java.util.Map;

public class targetsummofarray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int t= 7;
		
		
		//int[] op = sum(a,t);
		int[] op = method2(a,t);
		
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
	
	static int[] method2(int[] a, int t) {
		
		int left=0;
		int right = a.length-1;
		
		while(left<right) {
			int total = a[left]+a[right];
			
			if(total==t) {
				return new int[] {left,right};
			}else if(total>t) {
				right--;
				
			}else {
				left++;
			}
			
		}
		return new int[] {-1,-1};
		
	}

}

package learning;

import java.util.Arrays;

public class maxSumlessThanGivenK {

	public static void main(String[] args) {
		int[] a = {34,23,1,24,75,33,54,8};
		int t= 60;
        
		Arrays.sort(a);
		System.out.print(sum(a,t));
	}

	
static int sum(int[] a, int t) {
		
		int left=0;
		int right = a.length-1;
		int maxAmongLesssum=-1;
		
		while(left<right) {
			int sum = a[left]+a[right];
			
			if(sum<t) {
				maxAmongLesssum = Math.max(maxAmongLesssum, sum);
				left++;
				
			}else 
				right--;
	}
		return maxAmongLesssum;
}
}
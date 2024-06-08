package learning;

import java.util.Arrays;
import java.util.Collections;

public class reverseArray {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6};
		int arr1[] = {1,2,3,4,5,5,5};
		//mehtod1(arr);
		method2(arr1);
	}

	
	static void mehtod1(Integer a[]) {
		
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	
	static void method2(int arr1[]) {
		int i=0;
		int j= arr1.length-1;
		
		
		
		while(i<j) {
			
			int temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;		
			
			i++;
			j--;
		}
		for(int k=0;k<arr1.length;k++) {
		System.out.print(arr1[k]+ " ");
		}
	}
}

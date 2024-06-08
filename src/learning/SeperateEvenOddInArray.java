package learning;

import java.util.ArrayList;

public class SeperateEvenOddInArray {
	public static void main(String[] args) {
		int a[]= {11,12,13,15,16,10};
		oddevn(a);
		System.out.println("array after sepe");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
			
		}
		
	}
	static void oddevn(int a[]) {
		
		int i=0; int j = a.length-1; int temp;
		
		while(i<j) {
			while(a[i] %2==0 && i<j) 
				i++;
				
			while(a[j] %2==1 && i<j)
				j--;
			
			if(i<j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
	}

}

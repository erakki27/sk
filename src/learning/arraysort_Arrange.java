package learning;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysort_Arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,0,0,1,2,3};
		int[] arr1 = {3,1,2,4};
		//sort(arr);
		
//		moveNegetiveToleft(arr);
		zeroinEnd(arr);
printArray(arr);
	//moveNegetiveToleftarraylist(arr);
//System.out.print(sortArrayParity(arr1));
		
	}
	
	static void sort(int arr[]) {
		
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	
	static void moveNegetiveToleft(int arr[]) {
		
		int j=0,temp=0;
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<0) {
			if(i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		}
		  
	}
	
static void zeroinEnd(int arr[]) {
		
		int j=0,temp=0;
		
		for(int i=0;i<arr.length;i++) {
		if(arr[i] !=0) {
			//if(i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			//}
			j++;
		}
		}
		  
	}
	
	 
	 static void printArray(int arr[])
	    {
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
	 
	 static void moveNegetiveToleftarraylist(int arr[]) {
			
			int j=0;
			
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
			if(arr[i]<0 && i!=j ) {
					al.addFirst(arr[i]);
					
				}else
					al.addLast(arr[i]);
			
			}
			System.out.print(al);
			  
		}
	 
	 static Object[] sortArrayParity(int arr1[]) {
			
			int j=0;
			
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0 && i!=j ) {
					al.addFirst(arr1[i]);
					
				}else
					al.addLast(arr1[i]);
			
			}

			return al.toArray();
			  
		}

}

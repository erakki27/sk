package learning;

public class BinarySearch {

	public static void main(String[] args) {
		
		//int[] a = {-18,-12,0,2,4,6,39,41};
		
		int[] a = {20,19,18,14,2,1,0};
		int target = 2;
		
		System.out.println(orderagnosticsBinarySearch(a,target));

	}
 
	//return index of element
	//return -1 if not found
	static int binaryIndex(int[] a, int target) {
		int start =0;
		int end = a.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target<a[mid]) {
				end = mid-1;
			}else if(target>a[mid]) {
				start = mid+1;
				}else {
					//and
				return mid;
				}
		}
		
		return -1;
		
	}
	
	static int orderagnosticsBinarySearch(int[] a, int target) {
		
		int start =0;
		int end = a.length-1;
		
		boolean isAsc = a[start]<a[end];
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(a[mid]==target) {
				return mid;
			}
			if(isAsc) {
				if(target<a[mid]) {
					end = mid-1;
					
				}else {
					start = mid+1;
				}
				
			}else {
				if(target<a[mid]) {
					start = mid+1;
					
				}else {
					end = mid-1;
				}
			}
			
		}
		return -1;
		
		
		
	}
}

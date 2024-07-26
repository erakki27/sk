package learning;

public class FindIndexOfgIvenEleOrSupposeindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,5,6};
		int t=7;
		System.out.println(index(a,t));

	}
	
	static int index(int[] a, int t) {
		
		int start =0;
		int end = a.length-1;
		
		
		while(start<=end) {
			int mid = start+(end-start)/2;
		if(a[mid]==t) {
			return mid;
		}else if(a[mid]>t) {
			end = mid-1;
			
		}else
			start = mid+1;
			
		}	
		return start;
		
	}

}

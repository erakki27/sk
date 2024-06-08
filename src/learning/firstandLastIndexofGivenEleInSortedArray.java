package learning;

public class firstandLastIndexofGivenEleInSortedArray {

	public static void main(String[] args) {
		
		int[] n = {5,7,7,8,8,10};
		int target = 5;
		//int[] n = {};
		int[] op = searchIndex(n,target);
		
		if(op.length==2) {
			System.out.println(op[0] +" "+ op[1]);
			
		}else {
		System.out.println("-1");
		}

	}
	
	 static int[] searchIndex(int[] n, int target) {
		
		int left = findInLeft(n, target);
		int right = findInright(n,target);
		return new int[] {left,right};
		
	}
	
	
	static int findInLeft(int[] n, int target) {
		
		int index = -1;
		int low =0;
		int high=n.length-1;
		
		//binary search for left
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(n[mid] ==target) {
				index=mid;
				high = mid-1; //look in left subarray
			}else if(n[mid]<target) {
				low = mid+1;
				
			}else
				high = mid-1;
			
		}
		return index;
		
	}
	
static int findInright(int[] n, int target) {
		
		int index = -1;
		int low =0;
		int high=n.length-1;
		
		//binary search right
		
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if(n[mid] ==target) {
				index=mid;
				low = mid+1;		
			}else if(n[mid]<target) {
				low = mid+1;
				
			}else
				high = mid-1;
			
		}
		return index;
		
	}

}

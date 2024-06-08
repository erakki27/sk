package learning;

public class mergeArray {
	///Merge array where first array is m+n size and second array is n size
	public static void main(String[] args) {
		
		int nums1[]= {3,2,3,0,0,0};
		int nums2[] = {3,5,6};
		merge(nums1, nums2, 3,3);
		printArray(nums1);
		
	}

	
	static void merge(int nums1[],int nums2[], int m, int n) {
		
		int i= m-1;
		int j= n-1;
		int k = m+n-1;
		
		while(j>=0) {
			if(i>=0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
				
				
			}else {
				nums1[k--] = nums2[j--];
			}
			
		}
		
		
	}
	
	static void printArray(int nums1[])
    {
        for (int k = 0; k < nums1.length; k++)
            System.out.print(nums1[k] + " ");
    }
}

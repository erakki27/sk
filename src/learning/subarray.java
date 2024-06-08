package learning;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		sub(a);

	}
	
	static void sub(int a[]) {
		
		int start=0;
		int end =0;
		
		for(start=0; start<a.length;start++) {
			for(end = start; end<a.length;end++) {
				for(int k = start;k<=end ;k++) {
					System.out.print(a[k]);
					
				}
				System.out.println();
				
			}
			
			
			
		}
		
		
	}

}

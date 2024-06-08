package learning;

public class richestwealth {

	public static void main(String[] args) {
		int a[][] = {{1,3,2},{2,2,2},{5,6,5}};
  System.out.println(maxwealth(a));
	}
	
	static int maxwealth(int a[][]) {
		int ans = Integer.MIN_VALUE;
		
		for(int[] acc : a) {
			int sum=0;
			for(int bcc : acc){
				sum = sum+bcc;
				
			}
			 if(sum>ans) {
				 ans = sum;
			 }
		} 
		
		
		return ans;
		
	}

}

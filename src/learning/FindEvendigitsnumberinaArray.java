package learning;

public class FindEvendigitsnumberinaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,14,234,12,15634};
		
		System.out.println(evenfind(a));

	}
	
	static int evenfind(int[] a) {
		int count =0;
		for(int b : a) {
			if(even(b)) {
				count++;
				
			}
			
		}
		return count;
		
	}

	
	static int digit(int b) {
		
		int count =0;
		
			
			while(b>0) {
				count++;
				b = b/10;
				
			}
		return count;
		
	}
	
	static boolean even(int b) {
		int digitscount = digit(b);
		
		if(digitscount %2==0) {
			return true;
		}
		return false;
		
	}
}

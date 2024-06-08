package learning;

public class subtractEvnOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,7,8,9};
		int m=20;
		int n=10;

		subtract(a,m,n);
	}
	
	static void subtract(int[] a, int m, int n) {
		
		int evensub=0;
		int oddsub=0;
		
		for(int i=0; i<a.length;i++) {
			
			if(i%2==0) {
				evensub = a[i]-m;
				System.out.println("evensub " +evensub);	
			}else {
				oddsub= a[i]-n;
				System.out.println("oddsub "+oddsub);
			}
			
		}
		
	}

}

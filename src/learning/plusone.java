package learning;

public class plusone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]d = {9};		
		int[] op = oneplus(d);
		
		for(int i=0;i<op.length;i++) {
			System.out.print(op[i] +" ");
			
		}
	}
	
	static int[] oneplus(int[] d) {
		
		int n = d.length;
		
		for(int i=n-1;i>=0;i--) {
			d[i]++;
			
			if(d[i]<10) {
				return d;
			}else {
				d[i]=0;
			}
			
		}
		
		
		int[] newd = new int[n+1];
		newd[0]=1;
		return newd;
		
	}

}

package learning;

public class fabonicciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=10;
	int n =10;
	
	fabonicseries(count);
	System.out.println(nthfabonic(n));
		
		

	}



static void fabonicseries(int count) {
	int a=0; int b =1; int c;
	
	for(int i=2;i<=count;i++) {
		c=a+b;
		System.out.println("" +c);
		a=b;
		b=c;
	}
}

static int nthfabonic(int n) {
	int a=0; int b =1; int c;
	if(n==0) {
		return a;
		
	}
	
	for(int i=2;i<=n;i++) {
		c=a+b;
		a=b;
		b=c;
		
		
	}
	return b;
	
}
}
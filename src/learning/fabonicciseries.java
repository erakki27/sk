package learning;

public class fabonicciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; int b =1; int c; int count=10;
		
		for(int i=2;i<=count;i++) {
			c=a+b;
			System.out.println("" +c);
			a=b;
			b=c;
		}

	}

}

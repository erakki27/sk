package learning;

import java.util.Scanner;

public class halfSumEqualsSecod {

	public static void main(String[] args) {
System.out.println("Enter number");
		
		Scanner sc= new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		System.out.println(sumhalf(n));

	}
	
	static boolean sumhalf(int n) {
		String s = n+"";
		int sum=0;
		
		for(int i=0;i<s.length()/2;i++) {
			sum+= (s.charAt(i)-s.charAt(s.length()-1-i));
			System.out.println(sum);
			
		}
		return sum==0;
		
	}
	

}

package learning;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		System.out.println("Enter number for reverse");
           Scanner sc= new Scanner(System.in);
           int n = sc.nextInt();
           
           System.out.println(reverseInt(n));

	}
	
	static int reverseInt(int n) {
		int rem;
		
		long rev=0;
		
		while(n !=0) {
		rem = n % 10;
		rev = (rev*10)+rem;
		n=n/10;
		
		if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
			return 0;
			
		}
	}
		return (int)rev;
		
	}

}

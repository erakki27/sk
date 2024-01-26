package learning;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter Number to Check");

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
			
		
		System.out.println(armstrongnumber(n));
	}
		
		 static int armstrongnumber(int n) {
		int  temp = n;
		int p=0;
		
		while(n>0) {
			int rem = n%10;
			System.out.println(rem);
			p = (p)+(rem*rem*rem);
			System.out.println(p);
			n = n/10;
			System.out.println(n);
		}
		if(temp==p) {
			System.out.println("Its Armstorng number");
			
		}else {
			System.out.println("Its not an Armstorng number");
		}
		return p;
		
	}

}

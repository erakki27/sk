package learning;

import java.util.Scanner;

public class palindromeumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number to check");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	
	System.out.println("Plaindrome "   +   palindromenume(x));
	
		
	}
	
	static boolean palindromenume(int x) {
		
		StringBuilder s = new StringBuilder(String.valueOf(x));
		s.reverse();
		
		return s.toString().equals(String.valueOf(x));
		
	}

}

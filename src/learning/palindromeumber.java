package learning;

import java.util.Scanner;

public class palindromeumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number to check");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	
	//System.out.println("Plaindrome "   +   palindromenume(x));
	
	System.out.println("Plaindrome "   +   palindromemethod2(x));
	
		
	}
	
	static boolean palindromenume(int x) {
		
		StringBuilder s = new StringBuilder(String.valueOf(x));
		s.reverse();
		
		return s.toString().equals(String.valueOf(x));
		
	}
	
	static boolean palindromemethod2(int x) {
		
		if(x == 0) return true;

        if(x < 0 || x % 10 == 0) return false;
        int rem;
		
		long rev=0;
		
		while(x > rev) {
		rem = x % 10;
		rev = (rev*10)+rem;
		x=x/10;
		}
		System.out.print(rev);
		if(x == rev || x == rev / 10){
            return true;
        }else{
            return false;
        }
    }

}

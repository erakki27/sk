package learning;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
	
		System.out.println("Enter string ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			String str1 = str.toLowerCase();
			
			
			System.out.println("string is palindrome " + palidrome(str1));
		}
	}
		
	 static boolean palidrome(String str1) {
		 String revesred = "";
		 for(int i =str1.length()-1; i>=0;i--) {
			 revesred = revesred + str1.charAt(i);
			 System.out.println(revesred);
			 
		 }
		 
		return str1.equals(revesred);
	}

}

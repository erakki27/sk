package learning;

import java.util.Scanner;

public class RevesrseString {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		String str1 = str.toUpperCase();
		
		System.out.println(reversestring(str1));
		
	}
	
	static String reversestring(String str1) {
		
		String reverse = "";
		
		for(int i =str1.length()-1;i>=0;i--) {
			
			reverse = reverse+ str1.charAt(i);
			
			//System.out.println(reverse);
			
		}
		return reverse;
		
	}

}

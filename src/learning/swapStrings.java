package learning;

import java.util.Scanner;

public class swapStrings {
	
	public static void main(String[] args) {
		
		System.out.println("Enter string1 ");
		Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			System.out.println("Enter string2 ");
			String str2 = sc.nextLine();
			
			swap(str1,str2);
	}
	
	static void swap(String str1, String str2) {
		
		str1 = str1+str2;
		
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.print("After swap str1 = "  + str1 + " and str2 = " +str2);
		
		
		
	}

}
